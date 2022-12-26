package entities;

public class Course {
	
	private int ıD;
	private String courseName;
	private double price;
	
	
	public Course(int ıD, String courseName,double price) {
		this.ıD=ıD;
		this.courseName=courseName;
		this.price=price;
	}
	public int getıD() {
		return ıD;
	}
	public void setıD(int iD) {
		ıD = iD;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
