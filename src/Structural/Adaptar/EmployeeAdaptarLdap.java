package Structural.Adaptar;

public class EmployeeAdaptarLdap implements Employee {

	
	EmployeeLdap instance;
	
	
	public EmployeeAdaptarLdap( EmployeeLdap instance)
	{
		this.instance=instance;
	}
	
	
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return instance.getCn();
	}

	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return instance.getGivename();
	}

	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return instance.getSurname();
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return instance.getMail();
	}

}
