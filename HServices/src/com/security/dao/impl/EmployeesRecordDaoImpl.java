package com.security.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.security.dao.EmployeesRecordDaoIntf;
import com.security.dao.common.impl.GenericDaoImpl;
import com.security.entity.Employee;

public class EmployeesRecordDaoImpl extends GenericDaoImpl<Employee> implements EmployeesRecordDaoIntf {

	public EmployeesRecordDaoImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	//SQL_RETRIEVE_RECORDID = "SELECT firstName FROM EMPLOYEES WHERE empNO = ? ";
	@Override
	public Employee getEmployeeRecordForEmpNO(Long empNO) {
		Employee emp = null;
		Session session = this.getSession();
		emp = (Employee) session.createCriteria(Employee.class).uniqueResult();
		System.out.println("emp : "+emp);
		return emp;
	}

}