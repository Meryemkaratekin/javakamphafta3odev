package entities;

public class Category {
	private int Id;
	private String categoryName;
	public int getId() {
		return Id;
		
		
	}
	public Category(int Id, String categoryName) {
		this.Id=Id;
		this.categoryName=categoryName;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	

}
