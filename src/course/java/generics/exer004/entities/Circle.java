package course.java.generics.exer004.entities;

public class Circle implements Shape{
	
	// Attributes
	private Double radius;
	
	// Builders
	public  Circle() {
	}
	
	public Circle(Double radius) {
		this.radius = radius;
	}

	// Accessor Methods
	public Double getRadius() {
		return radius;
	}

	public void setRadius(Double radius) {
		this.radius = radius;
	}

	// Methods
	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2.0); 
	}

}
