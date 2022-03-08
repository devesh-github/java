package com.itouchsquare;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class ReportServlet
 */
public class ReportServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportServlet() {
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
		Session session=sf.openSession();
		session.beginTransaction();
		
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet();		
		//HSSFCell cell=sheet.createRow(0).createCell((short) 10);		
		//cell.setCellValue("patient Id");		
		response.addHeader("Content-disposition", "attachment; filename=report.xls");
		response.setContentType( "application/vnd.ms-excel");
		
		if ("radio_patient".equals(request.getParameter("radio"))) 
		{
			System.out.println("control1");
			if (""!=(request.getParameter("text_phone_number"))&& "Mobile/Phone"!=(request.getParameter("text_phone_number")))
			{
				System.out.println("control2");
				String SQL_QUERY="FROM Patient P WHERE P.patient_phone_number = '" + request.getParameter("text_phone_number")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control3");
					Patient patient = (Patient) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("patient Id: " + patient.getPatient_ID()); 
					out.print("Hospital Reg Id: " + patient.getHospital_reg_code()); 
					out.print("  Gender: " + patient.getGender()); 
					out.print("First Name: " + patient.getPatient_firstname()); 
					out.print("  Last Name: " + patient.getPatient_lastname()); 
					out.print("  DOB: " + patient.getPatient_dob());
					out.print("Height: " + patient.getPatient_height()); 
					out.print("  Weight: " + patient.getPatient_weight()); 
					out.print("  Ph No.: " + patient.getPatient_phone_number());
					out.println("Email Id: " + patient.getPatient_email()); 
					System.out.println("don1");
					
				}
				
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (""!=(request.getParameter("text_name"))&&"Name"!=(request.getParameter("text_name"))) 
			{
				System.out.println("control4");
					String SQL_QUERY1="FROM Patient P WHERE P.patient_firstname = '" + request.getParameter("text_name")+"'";
					Query query1=session.createQuery(SQL_QUERY1);
					List patientlist1=query1.list();
					
					for (Iterator iterator = 
			            patientlist1.iterator(); iterator.hasNext();)
					{
						System.out.println("control5");
						Patient patient = (Patient) iterator.next(); 
						PrintWriter out=response.getWriter();
						out.print("patient Id: " + patient.getPatient_ID()); 
						out.print("Hospital Reg Id: " + patient.getHospital_reg_code()); 
						out.print("  Gender: " + patient.getGender()); 
						out.print("First Name: " + patient.getPatient_firstname()); 
						out.print("  Last Name: " + patient.getPatient_lastname()); 
						out.print("  DOB: " + patient.getPatient_dob());
						out.print("Height: " + patient.getPatient_height()); 
						out.print("  Weight: " + patient.getPatient_weight()); 
						out.print("  Ph No.: " + patient.getPatient_phone_number());
						out.println("Email Id: " + patient.getPatient_email()); 
						System.out.println("don1");
						
					}	
					ServletOutputStream out;
					try {
						out=response.getOutputStream();
						workbook.write(out);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			
			}
			
		}else if ("radio_staff".equals(request.getParameter("radio"))) {
			System.out.println("don2");
			if (""!=(request.getParameter("text_phone_number"))&& "Mobile/Phone"!=(request.getParameter("text_phone_number")))
			{
				//Mobile phone no Part
				System.out.println("control6");
				String SQL_QUERY="FROM Staff S WHERE S.staff_mobile = '" + request.getParameter("text_phone_number")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control7");
					Staff staff = (Staff) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("Staff Id: " + staff.getStaff_ID()); 
					out.print("Hospital Reg Id: " + staff.getHospital_reg_code()); 
					out.print("  Gender: " + staff.getGender()); 
					out.print("First Name: " + staff.getStaff_firstname()); 
					out.print("  Last Name: " + staff.getStaff_lastname()); 
					out.print("  DOB: " + staff.getStaff_dob());
					out.print("Job Title: " + staff.getStaff_job_title()); 
					out.print("  Mobile No.: " + staff.getStaff_mobile()); 
					out.print("  Ph No.: " + staff.getStaff_phone());
					out.println("Email Id: " + staff.getStaff_email()); 
					System.out.println("don1");
					
				}
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (""!=(request.getParameter("text_name"))&&"Name"!=(request.getParameter("text_name"))) 
			{
				//Staff Name Part
				System.out.println("control8");
				String SQL_QUERY="FROM Staff S WHERE S.staff_firstname = '" + request.getParameter("text_name")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control9");
					Staff staff = (Staff) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("Staff Id: " + staff.getStaff_ID()); 
					out.print("Hospital Reg Id: " + staff.getHospital_reg_code()); 
					out.print("  Gender: " + staff.getGender()); 
					out.print("First Name: " + staff.getStaff_firstname()); 
					out.print("  Last Name: " + staff.getStaff_lastname()); 
					out.print("  DOB: " + staff.getStaff_dob());
					out.print("Job Title: " + staff.getStaff_job_title()); 
					out.print("  Mobile No.: " + staff.getStaff_mobile()); 
					out.print("  Ph No.: " + staff.getStaff_phone());
					out.println("Email Id: " + staff.getStaff_email()); 
					System.out.println("don1");
					
				}
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (""!=(request.getParameter("textfield"))&&"DOB"!=(request.getParameter("textfield"))) 
			{
				//Date of Birth Part
				System.out.println("control10");
				String SQL_QUERY="FROM Staff S WHERE S.staff_dob = '" + request.getParameter("textfield")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control11");
					Staff staff = (Staff) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("Staff Id: " + staff.getStaff_ID()); 
					out.print("Hospital Reg Id: " + staff.getHospital_reg_code()); 
					out.print("  Gender: " + staff.getGender()); 
					out.print("First Name: " + staff.getStaff_firstname()); 
					out.print("  Last Name: " + staff.getStaff_lastname()); 
					out.print("  DOB: " + staff.getStaff_dob());
					out.print("Job Title: " + staff.getStaff_job_title()); 
					out.print("  Mobile No.: " + staff.getStaff_mobile()); 
					out.print("  Ph No.: " + staff.getStaff_phone());
					out.println("Email Id: " + staff.getStaff_email()); 
					System.out.println("don1");
					
				}
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (""!=(request.getParameter("text_doj"))&&"DOJ"!=(request.getParameter("text_doj"))) 
			{
				//Date of Joining Part
				System.out.println("control12");
				String SQL_QUERY="FROM Staff S WHERE S.staff_doj = '" + request.getParameter("text_doj")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control13");
					Staff staff = (Staff) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("Staff Id: " + staff.getStaff_ID()); 
					out.print("Hospital Reg Id: " + staff.getHospital_reg_code()); 
					out.print("  Gender: " + staff.getGender()); 
					out.print("First Name: " + staff.getStaff_firstname()); 
					out.print("  Last Name: " + staff.getStaff_lastname()); 
					out.print("  DOB: " + staff.getStaff_dob());
					out.print("Job Title: " + staff.getStaff_job_title()); 
					out.print("  Mobile No.: " + staff.getStaff_mobile()); 
					out.print("  Ph No.: " + staff.getStaff_phone());
					out.println("Email Id: " + staff.getStaff_email()); 
					System.out.println("don1");
					
				}
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}else if("radio_hospital".equals(request.getParameter("radio"))){
			System.out.println("don3");
			System.out.println("don2");
			if (""!=(request.getParameter("text_phone_number"))&& "Mobile/Phone"!=(request.getParameter("text_phone_number")))
			{
				//Mobile phone no Part
				System.out.println("control6");
				String SQL_QUERY="FROM HospitalDataEntry H WHERE H.hospital_phone = '" + request.getParameter("text_phone_number")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control7");
					HospitalDataEntry hde = (HospitalDataEntry) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("Hospital Name: " + hde.getHospital_name()); 
					out.print("Hospital Zone: " + hde.getHospital_zone()); 
					out.print("Hospita region: " + hde.getHospital_region()); 
					out.print("Hospital Phone: " + hde.getHospital_phone()); 
					out.print("Hospital Registration Code: " + hde.getReg_code()); 
					System.out.println("don1");
					
				}
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (""!=(request.getParameter("text_name"))&&"Name"!=(request.getParameter("text_name"))) 
			{
				//Staff Name Part
				System.out.println("control8");
				String SQL_QUERY="FROM HospitalDataEntry H WHERE H.hospital_name = '" + request.getParameter("text_name")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control9");
					HospitalDataEntry hde = (HospitalDataEntry) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("Hospital Name: " + hde.getHospital_name()); 
					out.print("Hospital Zone: " + hde.getHospital_zone()); 
					out.print("Hospita region: " + hde.getHospital_region()); 
					out.print("Hospital Phone: " + hde.getHospital_phone()); 
					out.print("Hospital Registration Code: " + hde.getReg_code()); 
					System.out.println("don1");										
				}
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (""!=(request.getParameter("textfield"))&&"DOB"!=(request.getParameter("textfield"))) 
			{
				//Date of Birth Part
				System.out.println("control10");
				String SQL_QUERY="FROM HospitalDataEntry H WHERE H.staff_dob = '" + request.getParameter("textfield")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control11");
					HospitalDataEntry hde = (HospitalDataEntry) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("Hospital Name: " + hde.getHospital_name()); 
					out.print("Hospital Zone: " + hde.getHospital_zone()); 
					out.print("Hospita region: " + hde.getHospital_region()); 
					out.print("Hospital Phone: " + hde.getHospital_phone()); 
					out.print("Hospital Registration Code: " + hde.getReg_code()); 
					System.out.println("don1");
				}
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
			if (""!=(request.getParameter("text_doj"))&&"DOJ"!=(request.getParameter("text_doj"))) 
			{
				//Date of Joining Part
				System.out.println("control12");
				String SQL_QUERY="FROM HospitalDataEntry H WHERE H.staff_doj = '" + request.getParameter("text_doj")+"'";
				Query query=session.createQuery(SQL_QUERY);
				List patientlist=query.list();
				
				for (Iterator iterator = 
		            patientlist.iterator(); iterator.hasNext();)
				{
					System.out.println("control13");
					HospitalDataEntry hde = (HospitalDataEntry) iterator.next(); 
					PrintWriter out=response.getWriter();
					out.print("Hospital Name: " + hde.getHospital_name()); 
					out.print("Hospital Zone: " + hde.getHospital_zone()); 
					out.print("Hospita region: " + hde.getHospital_region()); 
					out.print("Hospital Phone: " + hde.getHospital_phone()); 
					out.print("Hospital Registration Code: " + hde.getReg_code()); 
					System.out.println("don1");										
				}
				ServletOutputStream out;
				try {
					out=response.getOutputStream();
					workbook.write(out);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		
	}	
}

