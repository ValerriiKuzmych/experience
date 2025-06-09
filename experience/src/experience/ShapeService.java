package experience;

import java.util.List;

public class ShapeService {

	public static void printAreas(List<Shape> shapes) {

		for (Shape shape : shapes) {

			System.out.println(shape.area());
		}
	}

}
