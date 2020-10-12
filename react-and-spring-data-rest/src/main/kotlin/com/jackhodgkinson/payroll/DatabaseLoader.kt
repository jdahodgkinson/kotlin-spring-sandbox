package com.jackhodgkinson.payroll

import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DatabaseLoader(val repository: EmployeeRepository) : CommandLineRunner {

    override fun run(vararg args: String?) {
        this.repository.save(Employee(0, "Frodo", "Baggins", "ring bearer"))
    }
}