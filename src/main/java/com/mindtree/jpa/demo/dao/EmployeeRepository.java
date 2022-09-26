package com.mindtree.jpa.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.mindtree.jpa.demo.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
