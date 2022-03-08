package com.security.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DEPT_EMP database table.
 * 
 */
@Entity
@Table(name="DEPT_EMP")
public class DeptEmp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEPT_EMP_DEID_GENERATOR", sequenceName="DEPT_EMP")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEPT_EMP_DEID_GENERATOR")
	private long deid;

	@Temporal(TemporalType.DATE)
	@Column(name="FROM_DATE")
	private Date fromDate;

	@Temporal(TemporalType.DATE)
	@Column(name="TO_DATE")
	private Date toDate;

	//bi-directional many-to-one association to Department
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DEPTNO")
	private Department department;

	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPNO")
	private Employee employee;

	public DeptEmp() {
	}

	public long getDeid() {
		return this.deid;
	}

	public void setDeid(long deid) {
		this.deid = deid;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}