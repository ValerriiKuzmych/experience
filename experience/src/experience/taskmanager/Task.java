package experience.taskmanager;

public abstract class Task {

	private Long id;

	private String title;

	private boolean completed;

	public Task() {

	}

	public Task(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
		this.completed = false;

	}

	abstract int getPriority();

	public void complete() {
		this.completed = true;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

}
