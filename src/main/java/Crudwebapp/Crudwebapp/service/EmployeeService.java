package Crudwebapp.Crudwebapp.service;

import java.util.List;
import Crudwebapp.Crudwebapp.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();
	public void saveEmployee(Employee employee);
	Employee getEmployeeById(long id);
	void deleteEmployeeById(long id);
	
	
}
