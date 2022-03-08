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
 * Servlet implementation class HospitalDataEntryServlet
 */
public class HospitalDataEntryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HospitalDataEntryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HospitalDataEntry hde=new HospitalDataEntry();
		hde.setHospital_name(request.getParameter("text_hospital_name"));
		hde.setHospital_zone(request.getParameter("text_hospital_zone"));
		hde.setHospital_region(request.getParameter("text_hospital_region"));
		hde.setHospital_phone(request.getParameter("text_hospital_phone_number"));
		hde.setHospital_email(request.getParameter("text_hospital_email"));
		
		NeoAddress na=new NeoAddress();
		na.setAdd_line1(request.getParameter("text_hospital_address_line_1"));
		na.setAdd_line2(request.getParameter("text_hospital_address_line_2"));
		na.setAdd_line3(request.getParameter("text_hospital_address_line_3"));
		na.setCity(request.getParameter("text_hospital_city"));
		na.setState(request.getParameter("text_hospital_state"));
		na.setZip_code(request.getParameter("text_hospital_zipcoce"));
		na.setCountry(request.getParameter("text_hospital_country"));
		
		Configuration c1=new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s1=sf.openSession();
		s1.beginTransaction();
		s1.save(hde);
		s1.save(na);
		s1.getTransaction().commit();
		s1.flush();
		s1.close();
		response.sendRedirect("admin-reference.html");
		System.out.println("done");
	}

}
