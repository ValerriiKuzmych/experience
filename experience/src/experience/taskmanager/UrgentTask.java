package experience.taskmanager;

public class UrgentTask extends Task {

	private Integer urgencyLevel;

	public UrgentTask(Long id, String title, Integer urgencyLevel) {
		super(id, title);
		this.urgencyLevel = urgencyLevel;

	}

	@Override
	int getPriority() {

		return 10 + urgencyLevel;
	}

	public int getUrgencyLevel() {
		return urgencyLevel;
	}

	public void setUrgencyLevel(int urgencyLevel) {
		this.urgencyLevel = urgencyLevel;
	}
}
