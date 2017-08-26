package com.techm.api.service;

import java.util.List;

import com.techm.api.bean.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();

	public Employee getEmployeeById(Integer id);

	public void addEmployee(Employee employee);

	public void updateEmployee(Employee employee);

	public void deleteEmployee(Integer id);

	
}
