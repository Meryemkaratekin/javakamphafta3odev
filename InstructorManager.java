package business;

import java.lang.System.Logger;
import java.util.List;

import dataAccess.InstructorDao;
import entities.Instructor;

public class InstructorManager {
	private InstructorDao ınstructorDao;
	
	private Logger[] loggers;
	
	
	public InstructorManager(InstructorDao ınstructorDao, Logger[] loggers) {
		this.ınstructorDao=ınstructorDao;
		this.loggers=loggers;
		
		
	}
	public void add(Instructor ınstructor) {
		ınstructorDao.add(ınstructor);
	
	    for(Logger logger : loggers) {// db mail bütün loglama çeşitleri sırayla çalşıyor.
	    	logger.log(null, ınstructor.getInstructorName());
	    	
	    	
	    }
	
	}
	  


	
	

}
