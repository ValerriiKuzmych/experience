package experience;

import java.util.Arrays;

public class UniqValueService {

	public static int[] uniqueValues(int[] integerList) {
		return Arrays.stream(integerList).distinct().toArray();
	}

	

}
