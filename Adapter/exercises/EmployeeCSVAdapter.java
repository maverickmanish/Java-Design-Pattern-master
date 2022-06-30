package exercises;

public class EmployeeCSVAdapter implements Employee {

	private EmployeeCSV instance;
	
	public EmployeeCSVAdapter(EmployeeCSV instance) {
		this.instance = instance;
	}
	
	@Override
	public String getId() {
		return instance.getId() + "";
	}

	@Override
	public String getFirstName() {
		return instance.getFirstName();
	}

	@Override
	public String getLastName() {
		return instance.getLastName();
	}

	@Override
	public String getEmail() {
		return instance.getEmailAddress();
	}

}
