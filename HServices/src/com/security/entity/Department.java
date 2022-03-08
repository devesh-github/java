package com.security.entity;


import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the DEPARTMENTS database table.
 * 
 */
@Entity
@Table(name="DEPARTMENTS")
public class Department implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="DEPARTMENTS_DEPTNO_GENERATOR", sequenceName="DEPARTMENTS")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="DEPARTMENTS_DEPTNO_GENERATOR")
	@Column(name="DEPT_NO")
	private long deptNo;

	@Column(name="DEPT_NAME")
	private String deptName;

	//bi-directional many-to-one association to DeptEmp
	@OneToMany(mappedBy="department")
	private List<DeptEmp> deptEmps;

	//bi-directional many-to-one association to DeptManager
	@OneToMany(mappedBy="department")
	private List<DeptManager> deptManagers;

	public Department() {
	}

	public long getDeptNo() {
		return this.deptNo;
	}

	public void setDeptNo(long deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public List<DeptEmp> getDeptEmps() {
		return this.deptEmps;
	}

	public void setDeptEmps(List<DeptEmp> deptEmps) {
		this.deptEmps = deptEmps;
	}

	public List<DeptManager> getDeptManagers() {
		return this.deptManagers;
	}

	public void setDeptManagers(List<DeptManager> deptManagers) {
		this.deptManagers = deptManagers;
	}

}