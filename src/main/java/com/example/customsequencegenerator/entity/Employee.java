package com.example.customsequencegenerator.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.example.customsequencegenerator.util.StringPrefixedSequenceIdGenerator;

@Entity
@Table(name="EMPLOYEE")
public class Employee {

@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = 
"book_seq")
@GenericGenerator(
    name = "book_seq", 
    strategy = 
"com.example.customsequencegenerator.util.StringPrefixedSequenceIdGenerator", 
    parameters = { @Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
        @Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "B_"),
        @Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
@Column(name="employee_id")
private String employeeId;

@Column(name="firstname")
private String firstname;

@Column(name="lastname")
private String lastname;

@Column(name="cell_phone")
private String cellphone;

public String getEmployeeId() {
	return employeeId;
}

public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public String getCellphone() {
	return cellphone;
}

public void setCellphone(String cellphone) {
	this.cellphone = cellphone;
}

public Employee(String employeeId, String firstname, String lastname, String cellphone) {
	super();
	this.employeeId = employeeId;
	this.firstname = firstname;
	this.lastname = lastname;
	this.cellphone = cellphone;
}

public Employee() {
	super();
}

//Getter and Setter methods.

}
