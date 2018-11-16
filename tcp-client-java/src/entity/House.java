package entity;

public class House {
	double height;
	double width;
	double lenght;
	double area;
	
	
	public House(double height, double width, double lenght, double area) {
		super();
		this.height = height;
		this.width = width;
		this.lenght = lenght;
		this.area = area;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLenght() {
		return lenght;
	}
	public void setLenght(double lenght) {
		this.lenght = lenght;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}


	
}
