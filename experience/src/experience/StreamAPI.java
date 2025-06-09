package experience;

import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {

	public static List<Integer> evenNumbersSelectingSquaringSorting(List<Integer> integerList) {

		List<Integer> evenNumbersSqueres = integerList.stream().filter((a) -> (a % 2 == 0)).map((a) -> (a * a)).sorted()
				.collect(Collectors.toList());

		return evenNumbersSqueres;

	}

}
