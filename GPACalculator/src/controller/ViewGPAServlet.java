package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.student;

/**
 * Servlet implementation class ViewGPAServlet
 */
@WebServlet("/ViewGPAServlet")
public class ViewGPAServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewGPAServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		float gpa;
		student s = new student();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String otherGpa =request.getParameter("postVar");
		System.out.print(otherGpa);
		out.print(otherGpa);
		
		//gpa = Float.parseFloat(request.getParameter("postVar"));
		//out.print(gpa);
		//s.setGpa(gpa);
		//request.setAttribute("GPA", s.getGpa());
		
		
		//getServletContext().getRequestDispatcher("/Gpa.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doGet(request, response);
	}

}
