package com.security.entity;


import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the TITLES database table.
 * 
 */
@Entity
@Table(name="TITLES")
public class Title implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TITLES_TITLESNO_GENERATOR", sequenceName="TITLES")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TITLES_TITLESNO_GENERATOR")
	@Column(name="TITLES_NO")
	private long titlesNo;

	@Temporal(TemporalType.DATE)
	@Column(name="FROM_DATE")
	private Date fromDate;

	private String titles;

	@Temporal(TemporalType.DATE)
	@Column(name="TO_DATE")
	private Date toDate;

	//bi-directional many-to-one association to Employee
	@OneToMany(mappedBy="title")
	private List<Employee> employees;

	public Title() {
	}

	public long getTitlesNo() {
		return this.titlesNo;
	}

	public void setTitlesNo(long titlesNo) {
		this.titlesNo = titlesNo;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public String getTitles() {
		return this.titles;
	}

	public void setTitles(String titles) {
		this.titles = titles;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public List<Employee> getEmployees() {
		return this.employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}