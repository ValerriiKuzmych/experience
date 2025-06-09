package experience;

public class Circle extends Shape{

	double radius;
	
	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	double area() {
		
		if (radius < 0) throw new IllegalArgumentException("Radius can't be <0");
		
		return Math.PI * radius * radius;
	}

}
