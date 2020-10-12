package com.jackhodgkinson.payroll

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Employee(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        var id: Long,
        var firstName: String,
        var lastName: String,
        var description: String
) {

    override fun toString(): String {
        return "Employee {" +
                "id=$id, " +
                "firstName=$firstName, " +
                "lastName=$lastName, " +
                "description=$description" +
                "}"
    }

}