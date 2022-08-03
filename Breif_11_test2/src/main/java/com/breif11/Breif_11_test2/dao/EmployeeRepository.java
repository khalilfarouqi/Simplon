package com.breif11.Breif_11_test2.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.breif11.Breif_11_test2.models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
