package exercises;

public class EmployeeLdapAdapter implements Employee {

	private EmployeeLdap instance;
	
	public EmployeeLdapAdapter(EmployeeLdap instance) {
		this.instance = instance;
	}
	
	
	@Override
	public String getId() {
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		return instance.getGivenName();
	}

	@Override
	public String getLastName() {
		return instance.getGivenName();
	}

	@Override
	public String getEmail() {
		return instance.getMail();
	}

}
