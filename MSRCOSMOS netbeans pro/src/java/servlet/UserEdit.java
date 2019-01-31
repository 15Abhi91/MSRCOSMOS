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
 
public class UserEdit extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");
        try {
            
            String F_name = request.getParameter("Fname");
            String M_name = request.getParameter("Mname");
            String L_name = request.getParameter("Lname");
            String email = request.getParameter("email");
            String phone = request.getParameter("mobile");
            String result = null;
            String nextJSP = "UserList.jsp";
            response.sendRedirect(nextJSP);
        }
        catch(Exception ex)
        {
            out.println(ex);
        }
    }

    

}
