package com.example.demo.repository;

import com.example.demo.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.elasticsearch.annotations.Query;
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {
    // Custom query methods (if needed) can be added here.
	@Query("{\"match\": {\"name\": \"?0\"}}")
    Iterable<Employee> findByName(String name);
}
