package com.techm.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.techm.api.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

}
