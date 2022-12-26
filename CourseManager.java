package business;

import java.lang.System.Logger;
import java.util.List;

import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {

	private CourseDao courseDao;

	private Logger[] loggers;
	
	
	private List<Course> courses;

	public CourseManager(CourseDao courseDao,Logger[] loggers ) {

		this.courseDao = courseDao;
		this.loggers = loggers;

	}

	public void add(Course course) throws Exception {

		if (course.getPrice() < 10) {
			throw new Exception("Kurs fiyatı 10 Tl den küçük olmaza");
		}
		for (Course courses1 : courses) {
			if (courses1.getCourseName().equals(courses1.getCourseName())) {
				throw new Exception("Kurs ismi tekrar edilemez.");
			}

		}
		courseDao.add(course);

		  
	    for(Logger logger : loggers) {// db mail bütün loglama çeşitleri sırayla çalşıyor.
	    	logger.log(null, course.getCourseName());
	    	
	    	
	    }
	}
}
