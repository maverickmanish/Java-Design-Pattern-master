package exercises;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {

	public List<Employee> getEmployeeList() {
		
		List<Employee> employees = new ArrayList<>();
		
		Employee employeeFromDB = new EmployeeDB("1234", "Sam", "Martin", "SamMartin@gmail.com");
		
		employees.add(employeeFromDB);
		
		EmployeeLdap employeeFromLdap = new EmployeeLdap("chewie", "Solo", "Han", "Han@Solo.com");
		
		//First Adapter
		employees.add(new EmployeeLdapAdapter(employeeFromLdap));
		
		EmployeeCSV employeeFromCSV = new EmployeeCSV("123,Sheldon,Cooper,sheldon@yahoo.com");
		
		//Second Adapter
		employees.add(new EmployeeCSVAdapter(employeeFromCSV));
		
		return employees;
	}
}
