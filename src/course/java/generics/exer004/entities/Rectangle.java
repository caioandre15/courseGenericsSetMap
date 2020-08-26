package course.java.generics.exer004.entities;

public class Rectangle implements Shape {

	// Attributes
	private Double width;
	private Double heigth;

	// Builders
	public Rectangle() {
	}

	public Rectangle(Double width, Double heigth) {
		this.width = width;
		this.heigth = heigth;
	}

	// Accessor Methods
	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigth() {
		return heigth;
	}

	public void setHeigth(Double heigth) {
		this.heigth = heigth;
	}

	// Methods
	@Override
	public double area() {
		return width * heigth;
	}
}
