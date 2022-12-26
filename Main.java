
import java.lang.System.Logger;
import java.util.List;


import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import dataAccess.HibernateInstructorDao;
import dataAccess.HibrnateCategoryDao;
import dataAccess.JdbcCourseDao;
import entities.Category;
import entities.Course;
import entities.Instructor;
import loging.DataBaseLogger;
import loging.FileLogger;
import loging.MailLogger;




public class Main {

	public static void main(String[] args)  throws Exception{

		Category category1 = new Category(15,"Yazılım" );
		Course course1 = new Course(123,"Java Kursu",1000);
		Instructor ınstructor1 = new Instructor("ENGİN DEMİROĞ");
		
		Logger[] loggers = null;
		
		CourseManager  courseManager = new CourseManager(new JdbcCourseDao(),loggers);
	    courseManager.add(course1);
	    System.out.println();
	    
	  
	    InstructorManager ınstructorManager = new InstructorManager(new HibernateInstructorDao(), loggers);
	    ınstructorManager.add(ınstructor1);
	    System.out.println();
	}
   
	
	
}
