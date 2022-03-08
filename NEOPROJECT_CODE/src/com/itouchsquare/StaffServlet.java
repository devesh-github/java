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
 * Servlet implementation class StaffServlet
 */
public class StaffServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StaffServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Staff s1=new Staff();
		s1.setHospital_reg_code("hospital");
		s1.setStaff_job_title(request.getParameter("text_staff_job_title"));
		s1.setGender(request.getParameter("select_gender"));
		s1.setStaff_firstname(request.getParameter("txt_first_name"));
		s1.setStaff_lastname(request.getParameter("txt_last_name"));
		s1.setStaff_dob(request.getParameter("txt_dob"));
		s1.setStaff_mobile(request.getParameter("text_mobile"));
		s1.setStaff_phone(request.getParameter("text_staff_phone"));
		s1.setStaff_phone_extension(request.getParameter("text_phone_extension"));
		s1.setStaff_email(request.getParameter("text_staff_email"));
		s1.setStaff_doj(request.getParameter("text_doj"));
		s1.setCreated_by(null);
		s1.setCreated_on(null);
		s1.setLast_modified_by(null);
		s1.setLast_modified_date(null);
		
		
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
		Session s2=sf.openSession();
		s2.beginTransaction();
		s2.save(s1);
		s2.save(na);
		s2.getTransaction().commit();
		s2.flush();
		s2.close();
		//response.sendRedirect("Success.html");
		System.out.println("done");
	}

}
