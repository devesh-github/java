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
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Login l1=new Login();
		l1=null;
		Configuration c1=new Configuration();
		c1.configure();
		SessionFactory sf=c1.buildSessionFactory();
		Session s2=sf.openSession();
		s2.beginTransaction();
		l1= (Login) s2.get(Login.class, request.getParameter("textfield"));
		
		String s1=(String)request.getParameter("text_login_password");
		String s3=(String)l1.getLogin_PWD();
		System.out.println(s1);
		System.out.println(s3);
		if (request.getParameter("textfield")==l1.getLogin_ID()) 
		{
			System.out.println("check");
			if (s1.equals(s3)) {
				response.sendRedirect("admin-reference.html");
			}
			
		}else {
			response.sendRedirect("login.x.html");
		}
		System.out.println("Login Id is" + l1.getLogin_ID());
		System.out.println("Login PWD is:" + l1.getLogin_PWD());
		
			
	}

}
