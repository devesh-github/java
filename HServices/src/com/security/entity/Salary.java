package com.security.entity;


import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;


/**
 * The persistent class for the SALARIES database table.
 * 
 */
@Entity
@Table(name="SALARIES")
public class Salary implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SALARIES_SALID_GENERATOR", sequenceName="SALARIES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SALARIES_SALID_GENERATOR")
	private long salid;

	@Temporal(TemporalType.DATE)
	@Column(name="FROM_DATE")
	private Date fromDate;

	private BigDecimal salary;

	@Temporal(TemporalType.DATE)
	@Column(name="TO_DATE")
	private Date toDate;

	//bi-directional many-to-one association to Employee
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="EMPNO")
	private Employee employee;

	public Salary() {
	}

	public long getSalid() {
		return this.salid;
	}

	public void setSalid(long salid) {
		this.salid = salid;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public BigDecimal getSalary() {
		return this.salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}