package Structural.Adaptar;

public class AdaptarDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 EmployeeClient client = new EmployeeClient();
		
		 List<Employee> employees = client.getEmployeeList();
		 System.out.println(employees);
           		
	}

}
