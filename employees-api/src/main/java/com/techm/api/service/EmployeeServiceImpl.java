package com.techm.api.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techm.api.bean.Employee;
import com.techm.api.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		
		List<Employee> employeesList = new ArrayList<Employee>();
		
		Iterator<Employee> iterator = employeeRepository.findAll().iterator();
		while(iterator.hasNext()) {
			employeesList.add(iterator.next());
		}
		return employeesList;
	}

	@Override
	public Employee getEmployeeById(Integer id) {		
		return employeeRepository.findOne(id);
	}

	@Override
	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Integer id) {
		employeeRepository.delete(id);
	}
}
