
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class registerServlet extends HttpServlet {

    
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String F_name = request.getParameter("Fname");
            String M_name = request.getParameter("Mname");
            String L_name = request.getParameter("Lname");
            String email = request.getParameter("email");
            String phone = request.getParameter("mobile");
            String pass = request.getParameter("pass");
            String Cpass = request.getParameter("cpass");
            String result = null;
            if(pass.equals(Cpass))
            {
                 result =com.abhinay.controller.RegistrationCont.insertRegis(F_name, M_name, L_name, email, phone, pass );
            }
            else{
                 result = "Please Re Enter the password..!";
            }
            String nextJSP = "UserLogin.jsp";
            response.sendRedirect(nextJSP);
//        out.println(F_name);
//        out.println(M_name);
//        out.println(L_name);
//        out.println(email);
//        out.println(phone);
//        out.println(pass);
        }
        
        catch(Exception ex)
        {
            
        }
    }

    
}
