package experience;

import java.util.List;

import experience.taskmanager.RegularTask;
import experience.taskmanager.Task;
import experience.taskmanager.TaskManager;
import experience.taskmanager.UrgentTask;

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

//		System.out.println(WordScorer
//				.getMostCommonWords(List.of("Java is cool", "Java and Spring", "Spring is powerful", "I love Java")));

//		int[] IntegerList = { 1, 2, 2, 3, 4, 4, 5 };
//
//		for (int i : UniqValueService.uniqueValues(IntegerList)) {
//			System.out.println(UniqValueService.uniqueValues(IntegerList)[i - 1]);
//		}
//		String[] words = { "apple", "banana", "apple", "orange", "banana", "apple" };
//		System.out.println(WordScorer.wordScoring(words));

//		List<Integer> integerList = List.of(3, 4, 7, 2, 8, 5);
//
//		System.out.println(StreamAPI.evenNumbersSelectingSquaringSorting(integerList));
//		List<User> users = List.of(new User("Alice", "alice@mail.com"), new User("Bob", "bob@mail.com"));
//		System.out.println(OptionalService.findUserNameByEmail(users, "ice@mail.com"));

//		
		TaskManager manager = new TaskManager();
		manager.addTask(new RegularTask(1L, "Do homework"));
		manager.addTask(new UrgentTask(2L, "Fix prod", 3));

		List<Task> sorted = manager.getSortedTasksByPriority();

	}

}
