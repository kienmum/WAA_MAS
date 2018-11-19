package edu.mum.waa.service;

import java.util.List;

import edu.mum.waa.domain.Employee;

public interface EmployeeService {

	public List<Employee> getAll();
	
	public Employee save(Employee employee);
	
	public Employee locateOneEmployeeByHisNumber(int employeeNumber);
}
