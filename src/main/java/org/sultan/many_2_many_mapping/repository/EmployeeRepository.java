package org.sultan.many_2_many_mapping.repository;

import org.sultan.many_2_many_mapping.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}