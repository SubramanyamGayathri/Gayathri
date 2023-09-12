package com.servlet.java;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterPrac")
public class RegistrationPrac extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 RequestDispatcher rd=null;
   
    public RegistrationPrac() {
        super();
        
    }


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
  String FirstName=request.getParameter("fname");
  String LastName=request.getParameter("lname");
  String UserName=request.getParameter("uname");
  String Password=request.getParameter("pword");
  String Address=request.getParameter("address");
  String ContactNumber=request.getParameter("contactNo");
  
  Queryprac qp=new Queryprac();
 
  int result;
		 try {
			 result=qp.insert(FirstName, LastName,UserName,Password,Address,ContactNumber);
			if(result>0)
			 {
				 rd=request.getRequestDispatcher("./RegisterCss.jsp");
				 rd.forward(request,response);
			 }
			 else
			 {
				 rd=request.getRequestDispatcher("./RegisterPrac.jsp");
				 rd.forward(request,response);
			 }
		 }catch(Exception e)
		 {
			 
		 System.out.println(e);

  }
  
  
 }

}
