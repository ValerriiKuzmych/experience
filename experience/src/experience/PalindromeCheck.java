package experience;

public class PalindromeCheck {
	
	public static boolean isPalindrome(String str) {

		String cleaned = str.toLowerCase().replaceAll("\\s+", "");

		String reversed = new StringBuilder(cleaned).reverse().toString();

		return cleaned.equals(reversed);

	}
}
