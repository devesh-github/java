package com.itouchsquare;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class Search_Simple
 */
public class Search_Simple extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search_Simple() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Configuration c1=new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		s1.beginTransaction();
		Query setHospitalDetail=s1.createQuery(request.getParameter("select *from neo_hospital_t"));
		List setlists=setHospitalDetail.list();
		for (Iterator iterator = setlists.iterator(); iterator.hasNext();) 
		{
			HospitalDataEntry setlist=(HospitalDataEntry) iterator.next();
			System.out.println("hospital id:" + setlist.getHospital_id());
			System.out.println("hospital registration code:" + setlist.getHospital_name());
			System.out.println("hospital Region is:" + setlist.getHospital_region());
			System.out.println("hospital zone:" + setlist.getHospital_zone());
			System.out.println("hospital phone Number:" + setlist.getHospital_phone());
			System.out.println("hospital Email Id:" + setlist.getHospital_email());
			System.out.println("hospital created by:" + setlist.getCreated_by());
			System.out.println("hospital created on:" + setlist.getCreated_on());
			System.out.println("hospital last modify by:" + setlist.getLast_modified_by());
			System.out.println("hospital last modify date" + setlist.getLast_modified_date());
			
			
			
		}
		/*List setlists=s1.createQuery("select *from neo_hospital_t where hospital_reg_code=request.getParameter('text_hospital_name')").list();
		for (Iterator iterator = setlists.iterator(); iterator.hasNext();) 
		{
			HospitalDataEntry setlist=(HospitalDataEntry) iterator.next();
			System.out.println("hospital id:" + setlist.getHospital_id());
			System.out.println("hospital registration code:" + setlist.getHospital_name());
			System.out.println("hospital Region is:" + setlist.getHospital_region());
			System.out.println("hospital zone:" + setlist.getHospital_zone());
			System.out.println("hospital phone Number:" + setlist.getHospital_phone());
			System.out.println("hospital Email Id:" + setlist.getHospital_email());
			System.out.println("hospital created by:" + setlist.getCreated_by());
			System.out.println("hospital created on:" + setlist.getCreated_on());
			System.out.println("hospital last modify by:" + setlist.getLast_modified_by());
			System.out.println("hospital last modify date" + setlist.getLast_modified_date());
			
			
			
		}*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
