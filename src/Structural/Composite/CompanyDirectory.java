package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

// composite class. do all add remove operations
public class CompanyDirectory implements Employee {

	
	private List<Employee> employeeList = new ArrayList<>();
	@Override
	public void showEmployeeDetail() {
		// TODO Auto-generated method stub
             
		for(Employee emp: employeeList)
		{
			emp.showEmployeeDetail();
		}}
		public void addEmployee(Employee emp)
		{
			employeeList.add(emp);
		}
		
		public void removeEmployee(Employee emp)
		{
			employeeList.remove(emp);
		}
	}


