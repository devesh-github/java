
package com.security.dto;

import java.util.Date;

public class Employees {
    
    private String empNO;
    private String firstName;
    private String lastName;
    private Date birthDate;  
    private Date hireDate;
    private String titlesNO;
	public String getEmpNO() {
		return empNO;
	}
	public void setEmpNO(String empNO) {
		this.empNO = empNO;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getTitlesNO() {
		return titlesNO;
	}
	public void setTitlesNO(String titlesNO) {
		this.titlesNO = titlesNO;
	}
 
}
