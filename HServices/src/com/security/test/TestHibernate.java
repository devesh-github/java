package com.security.test;

import java.util.Calendar;
import java.util.Date;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.security.dao.EmployeesRecordDaoIntf;
import com.security.dao.impl.EmployeesRecordDaoImpl;
import com.security.entity.Employee;

public class TestHibernate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		SessionFactory sessionFactory =new AnnotationConfiguration().configure("../resources/hibernate.cfg.xml").buildSessionFactory();
		
		Date dob = Calendar.getInstance().getTime();
		
		EmployeesRecordDaoIntf empRec = new EmployeesRecordDaoImpl(sessionFactory);
		Employee messages = empRec.getEmployeeRecordForEmpNO(Long.valueOf(1));
		System.out.println(messages);
		if(messages != null){
			///System.out.println( messages.size() +	" message(s) found:" );
			System.out.println(messages.getEmpNo());
		}
		
		//for(Employee mess: messages) {
			//System.out.println(mess.getRelationshipType().getRelationshipTypeId());
		//}
		
		sessionFactory.close();
	}
}
