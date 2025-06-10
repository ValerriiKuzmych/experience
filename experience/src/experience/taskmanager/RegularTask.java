package experience.taskmanager;

public class RegularTask extends Task{

	private Integer priority = 5;
	
	
	public RegularTask(Long id, String title) {
		super(id, title);
		
	}


	@Override
	int getPriority() {
		
		return priority;
	}
	
	

}
