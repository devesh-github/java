package com.bs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import billingsoftwareproject.*;

/**
 * Servlet implementation class ProcessorServlet
 */
//@WebServlet("/ProcessorServlet")
public class ProcessorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ProcessorServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String burgher = request.getParameter("burgher1");  
		String fries = request.getParameter("fries1");  
		String coldDrinks = request.getParameter("coldDrinks1");
		String toys = request.getParameter("toys1");
		String icecream = request.getParameter("icecream1");
		
		response.setContentType("text/html"); 
		 
		long burgherQuantity=0,friesQuantity=0,cdQuantitiy=0,toysQuantity=0,icQuantity=0;
		
		if(burgher!=null && !burgher.equalsIgnoreCase("")) {
			System.out.println("burgher" +burgher);
			burgherQuantity = Long.parseLong(burgher);
		} else if (fries!=null && !fries.equalsIgnoreCase("")) {
			friesQuantity = Long.parseLong(fries);
		} else if (coldDrinks!=null && !coldDrinks.equalsIgnoreCase("")) {
			cdQuantitiy = Long.parseLong(coldDrinks);
		} else if (toys!=null && !toys.equalsIgnoreCase("")) {
			System.out.println(toys);
			toysQuantity = Long.parseLong(toys);
		} else if (icecream!=null && !icecream.equalsIgnoreCase("")) {
			icQuantity = Long.parseLong(icecream);
		}
		
		ProcessorServlet ps = new ProcessorServlet();
		long sum = ps.calculate(burgherQuantity,friesQuantity,cdQuantitiy,toysQuantity,icQuantity);
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/Success.jsp");
		request.setAttribute("BillAmount", String.valueOf(sum));
		rd.forward(request, response);
	}
	
	public long calculate(long burgherQuantity, long friesQuantity, long cdQuantity, long toysQuantity, long icQuantity) {
		long sum = 0;
		BillingSoftwareProject port = BillingSoftwareProject_BillingSoftwareProjectPort_Client.BillingSoftwareProjectClient();
		Input menuParameters = new Input();
        Long value = 1l;
        menuParameters.setNumber1(value);	
        Output menu = port.menu(menuParameters);
		sum = menu.getResult().getBurgher().getBurgherPrice() * burgherQuantity;
		sum = sum + (menu.getResult().getFries().getFriesPrice() * friesQuantity);
		sum = sum + (menu.getResult().getColddrinks().getColddrinksPrice() * cdQuantity);
		sum = sum + (menu.getResult().getToys().getToysPrice() * toysQuantity);
		sum = sum + (menu.getResult().getIcecreams().getIcecreamsPrice() * icQuantity);
		
		return sum;
	}
}
