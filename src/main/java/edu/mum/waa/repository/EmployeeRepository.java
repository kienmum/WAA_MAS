package edu.mum.waa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import edu.mum.waa.domain.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
	@Query(value = "select * from Employee e left join Address a on e.address_id = a.id where e.employeeNumber = ?1", nativeQuery = true)
	public Employee locateOneEmployeeByHisNumber(int employeeNumber);
	@Query(value = "select e from Employee e left join fetch e.address")
	public List<Employee> getAllEmployees();
}
