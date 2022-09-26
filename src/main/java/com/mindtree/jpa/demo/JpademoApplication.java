package com.mindtree.jpa.demo;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.mindtree.jpa.demo.dao.EmployeeRepository;
import com.mindtree.jpa.demo.entity.Employee;

@SpringBootApplication
public class JpademoApplication {


	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(JpademoApplication.class, args);
		
		EmployeeRepository employeeRepository = context.getBean(EmployeeRepository.class);
		
		
		Employee emp = new Employee();
		emp.setName("gyan singh");
		emp.setAge(47);
		
		Employee emp2 = new Employee();
		emp2.setName("prakash");
		emp2.setAge(23);
		
		employeeRepository.save(emp);
		
		
		
		/*
		//Employee emp1 = employeeRepository.save(emp);
		 List<Employee> users = List.of(emp,emp2);
		
		Iterable<Employee> result = employeeRepository.saveAll(users);
		
		result.forEach((user)->{
			System.out.println(user);
		});
		
		
		// update data;
		
		/*
		Optional<Employee> optional = employeeRepository.findById(3);
		Employee employee = optional.get();
		
		employee.setAge(24);
		
		Employee emp = employeeRepository.save(employee);
		System.out.println(emp);
		
		
		
		Optional<Employee> emp5 = employeeRepository.findById(5);
		Employee employee5 = emp5.get();
		employee5.setAge(45);
		employeeRepository.save(employee5);
		
		*/
		
		// read data;
		
		Iterable<Employee> itr = employeeRepository.findAll();
		
		itr.forEach(employee->System.out.println(employee));
		
		/*
		itr.forEach(new Consumer<Employee>() {

			@Override
			public void accept(Employee t) {
				// TODO Auto-generated method stub
				System.out.println(t);
			}
			
		});
		*/
		
		//delete data;
		// employeeRepository.deleteById(34);
	}

}
