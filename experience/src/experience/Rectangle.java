package experience;

public class Rectangle extends Shape {

	double width;
	double height;

	@Override
	double area() {

		return width * height;
	}

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

}
