package business;

import java.lang.System.Logger;
import java.util.List;

import dataAccess.CategoryDao;
import dataAccess.HibrnateCategoryDao;
import entities.Category;
import entities.Course;

public class CategoryManager {
	private CategoryDao categoryDao;
	private  Logger[] loggers;
	
	private List<Category> categories;
	
	 public CategoryManager( CategoryDao categoryDao ,Logger[] loggers) {
		 this.categoryDao =categoryDao;
		 this.loggers=loggers;
		 
		 
	}
	
	public void add(Category category) throws Exception {
		
	if(category.getCategoryName().equals(category.getCategoryName())) {
	   throw new Exception("Katogori ismi tekrar edemez.");
	}
	 categoryDao.add(category); 
	 
	  
	    for(Logger logger : loggers) {// db mail bütün loglama çeşitleri sırayla çalşıyor.
	    	logger.log(null, category.getCategoryName());
	    	
	    	
	    }
}}
