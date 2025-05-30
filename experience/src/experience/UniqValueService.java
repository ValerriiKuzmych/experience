package experience;

import java.util.Arrays;

public class UniqValueService {

	public static int[] uniqueValues(int[] input) {
		return Arrays.stream(input).distinct().toArray();
	}

}
