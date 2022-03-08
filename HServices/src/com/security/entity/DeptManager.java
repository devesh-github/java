package com.security.entity;


import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the DEPT_MANAGER database table.
 * 
 */
@Entity
@Table(name="DEPT_MANAGER")
public class DeptManager implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEPT_MANAGER_DMID_GENERATOR", sequenceName="DEPT_MANAGER")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEPT_MANAGER_DMID_GENERATOR")
	private long dmid;

	@Temporal(TemporalType.DATE)
	@Column(name="FROM_DATE")
	private Date fromDate;

	@Temporal(TemporalType.DATE)
	@Column(name="TO_DATE")
	private Date toDate;

	//bi-directional many-to-one association to Department
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="DEPTNUMBER")
	private Department department;

	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPNUMBER")
	private Employee employee;

	public DeptManager() {
	}

	public long getDmid() {
		return this.dmid;
	}

	public void setDmid(long dmid) {
		this.dmid = dmid;
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