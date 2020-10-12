package com.jackhodgkinson.payroll

import org.springframework.data.repository.CrudRepository

interface EmployeeRepository : CrudRepository<Employee, Long>