package experience.taskmanager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {

	List<Task> tasks = new ArrayList<>();;

	public void addTask(Task task) {

		tasks.add(task);

	}

	public List<Task> getSortedTasksByPriority() {

		return tasks.stream().sorted(Comparator.comparingInt(Task::getPriority).reversed())
				.collect(Collectors.toList());
	}

	public List<Task> getUncompletedTasks() {
		return tasks.stream().filter(t -> !t.isCompleted()).collect(Collectors.toList());
	}

}
