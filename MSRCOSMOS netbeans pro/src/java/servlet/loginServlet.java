/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class loginServlet extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
            String email = request.getParameter("email");
            String password = request.getParameter("pwd");
            String result = com.abhinay.controller.loginController.login(email, password);
           if(result.equals("ok")){
              String nextJSP = "UserList.jsp";
            response.sendRedirect(nextJSP); 
           }
           else{
               result = "email id or password will be wrong...";
           }
        }
        catch(Exception ex)
        {
            
        }
    }

}
