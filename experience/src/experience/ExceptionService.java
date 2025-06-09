package experience;

public class ExceptionService {

	public static int safeDivide(int a, int b) {

		if (b == 0)
			throw new IllegalArgumentException("Cannot divide by zero");

		return a / b;
	}

}
