package experience;

import java.util.List;

public class Main {

	public static void main(String[] args) {

//		System.out.println(PalindromeCheck.isPalindrome("sas"));
//		System.out.println(WordScorer.wordCounting("Java is great and Java is powerful"));

//		List<Student> students = List.of(new Student("Anna", 5), new Student("Boris", 4), new Student("Kate", 5),
//				new Student("Peter", 3));
//
//		System.out.println(Student.sortingByRaiting(students));

//		List<Student> students = List.of(new Student("Anna", 5, 21), new Student("Boris", 4, 22),
//				new Student("Kate", 5, 19), new Student("Peter", 3, 24));
//
//		for (Student student : Student.sortStudents(students)) {
//
//			System.out.println(student.getName() + " Grade " + student.getGrade() + " Age " + student.getAge());
//
//		}

		System.out.println(WordScorer
				.getMostCommonWords(List.of("Java is cool", "Java and Spring", "Spring is powerful", "I love Java")));

	}

}
