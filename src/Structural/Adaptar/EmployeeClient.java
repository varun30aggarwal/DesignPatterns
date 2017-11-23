package Structural.Adaptar;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList()
	{
		List<Employee> employees = new ArrayList<>();
		
		// data from database format ...
		Employee employeefromDb = new EmployeeDB("12", "varun", "ag", "a@gmal");
		employees.add(employeefromDb);
		
		EmployeeLdap employeefromLDap =  new EmployeeLdap("ab", "cd", "ag", "asws@gmal");
		
		
		employees.add( new EmployeeAdaptarLdap(employeefromLDap));
		
		return employees;
	}
	
	
}
