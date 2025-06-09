package experience;

import java.util.List;

public class OptionalService {

	public static String findUserNameByEmail(List<User> users, String email) {

		return users.stream().filter(u -> u.getEmail().equals(email)).findFirst().map(u -> u.getName())
				.orElse("Unknown user");
	}

}
