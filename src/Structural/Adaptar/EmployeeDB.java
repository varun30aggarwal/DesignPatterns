package Structural.Adaptar;

public class EmployeeDB implements Employee {

	
	private String id;
	private String firstName;
	private String lastName;
	private String email;
	
	public EmployeeDB( String id, String firstName, String lastName, String email)
	{
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email=email;
	}
	
	

	public void setId(String id) {
		this.id = id;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	
	public String getFirstName() {
		// TODO Auto-generated method stub
		return firstName;
	}

	
	public String getLastName() {
		// TODO Auto-generated method stub
		return lastName;
	}

	
	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}

	public String toString()
	{
		return "ID: " + id +", First name: " + firstName + ", Last name: " + lastName + ", Email: " + email;

	}
	
	
	
}
