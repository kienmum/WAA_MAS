package edu.mum.waa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.mum.waa.domain.Employee;
import edu.mum.waa.repository.EmployeeRepository;
import edu.mum.waa.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	@Override
	public List<Employee> getAll() {
		
		return empRepository.getAllEmployees();
	}

	@Override
	public Employee save(Employee employee) {
		
		return empRepository.save(employee);
	}

	@Override
	public Employee locateOneEmployeeByHisNumber(int employeeNumber) {
		
		return empRepository.locateOneEmployeeByHisNumber(employeeNumber);
	}

	
}
