package com.javapage.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
 
import com.javapage.model.User;
import com.javapage.service.RegisterService;

public class RegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
     response.setContentType("text/html;charset=UTF-8");
     PrintWriter out = response.getWriter();
     String first_name = request.getParameter("first_name");
     String last_name = request.getParameter("last_name");
     String email = request.getParameter("email");
     String userName = request.getParameter("userName");
     String password = request.getParameter("password");
     User user = new User(first_name,last_name, email,userName, password);
     
     try { 
         RegisterService registerService = new RegisterService();
         boolean result = registerService.register(user);      
         out.println("<html>");
         out.println("<head>");      
         out.println("<title>Registration Successful</title>");    
         out.println("</head>");
         out.println("<body>");
         out.println("<center>");
         if(result){
             out.println("<h1>Thanks for Registering with us :</h1>");
             out.println("To login with new UserId and Password<a href=login.jsp>Click here</a>");
         }else{
             out.println("<h1>Registration Failed</h1>");
             out.println("To try again<a href=register.jsp>Click here</a>");
         }
         out.println("</center>");
         out.println("</body>");
         out.println("</html>");
     } finally {       
         out.close();
     
 }
	}
}
        

