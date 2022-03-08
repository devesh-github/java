package com.itouchsquare;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class PatientServlet
 */
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Patient p1=new Patient();
		
		p1.setPatient_email(request.getParameter("text_patient_email"));
		p1.setPatient_firstname(request.getParameter("textfield4"));
		p1.setPatient_lastname(request.getParameter("textfield5"));
		p1.setPatient_phone_number(request.getParameter("textfield3"));	
		p1.setPatient_dob(request.getParameter("textfield6"));
		p1.setPatient_weight(request.getParameter("text_patient_weight"));			
		p1.setPatient_height(request.getParameter("textfield7"));
		p1.setCreated_by("admin");
		p1.setCreated_on(null);
		p1.setLast_modified_by("admin");
		p1.setLast_modified_date(null);
		p1.setGender(request.getParameter("select_patient_gender"));
		p1.setHospital_reg_code(null);
		
		NeoAddress na=new NeoAddress();
		na.setAdd_line1(request.getParameter("text_hospital_address_line_1"));
		na.setAdd_line2(request.getParameter("text_hospital_address_line_2"));
		na.setAdd_line3(request.getParameter("text_hospital_address_line_3"));
		na.setCity(request.getParameter("text_hospital_city"));
		na.setState(request.getParameter("text_hospital_state"));
		na.setZip_code(request.getParameter("text_hospital_zipcoce"));
		na.setCountry(request.getParameter("text_hospital_country"));
		na.setCreated_by("admin");
		na.setCreated_on("01-01-1990");
		na.setLast_modified_by("admin");
		na.setLast_modified_date(null);
		na.setReferenceid(null);
		
		
		Configuration c1=new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		s1.beginTransaction();
		s1.save(p1);
		s1.save(na);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		//response.sendRedirect("Success.html");
		System.out.println("done");
		
		
	}

	

}
