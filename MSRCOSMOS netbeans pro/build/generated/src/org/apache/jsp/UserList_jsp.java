package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.abhinay.model.userEditModel;
import com.abhinay.controller.UserEditController;
import servlet.UserEdit;
import com.abhinay.model.UserList;
import com.abhinay.controller.UserListController;
import java.util.List;

public final class UserList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>MSRCosMos</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js\"></script>  \n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("       <div class=\"container\">\n");
      out.write("            <h2>User Table</h2>\n");
      out.write("            <table class=\"table table-bordered\">\n");
      out.write("                <thead>\n");
      out.write("                    <tr>                        \n");
      out.write("                        <th>Id</th>\n");
      out.write("                        <th>name</th>\n");
      out.write("                        <th>email</th>\n");
      out.write("                        <th>phone</th>\n");
      out.write("                        <th>Action</th>\n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                             ");

                                    try {
//                                        List list = UserListController.UserRegisList();
                                        List list = UserListController.UserRegisList();
                                        for (int i = 0; i < list.size(); i++) {
                                        UserList t1 = (UserList) list.get(i);
             
      out.write("\n");
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print(i+1);
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( t1.getF_name());
      out.write(' ');
      out.print( t1.getM_name());
      out.write(' ');
      out.print( t1.getL_name());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(t1.getMobile());
      out.write("</td>\n");
      out.write("                        <td>");
      out.print(t1.getEmail());
      out.write("</td>\n");
      out.write("                        <td><a href=\"UserDelete?id=");
      out.print(t1.getId());
      out.write("\" >Delete</a></td>\n");
      out.write("                        <td><a href=\"UserEdit?id=");
      out.print(t1.getId());
      out.write("\">Edit</a></td>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                </tbody>\n");
      out.write("                ");
}}
                    catch(Exception ex)
                     {
                     
                     }
                     
             
      out.write("\n");
      out.write("            </table>\n");
      out.write("             \n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h2>User Registration</h2>\n");
      out.write("            <form class=\"form-horizontal\" action=\"registerServlet\" method=\"post\">\n");
      out.write("                 ");

                                                try {
//                                        List list = userEditController.;
                                        List list = UserEditController.SelectUser();
                                        for (int i = 0; i < list.size(); i++) {
                                        userEditModel t1 = (userEditModel) list.get(i);
             
      out.write("\n");
      out.write("\n");
      out.write("                <input type=\"hidden\" class=\"form-control\" id=\"id\">\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\" for=\"email\">First Name:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Enter First Name\" value=\"");
      out.print(t1.getF_name());
      out.write("\" name=\"Fname\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\" for=\"email\">Middle Name:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Enter Middle Name\" value=\"");
      out.print(t1.getM_name());
      out.write("\" name=\"Mname\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\" for=\"email\">Last Name:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"email\" placeholder=\"Enter Last Name\" name=\"Lname\" value=\"");
      out.print(t1.getL_name());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\" for=\"email\">Email:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"email\" placeholder=\"Enter email\" value=\"");
      out.print(t1.getEmail());
      out.write("\" name=\"email\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                    <label class=\"control-label col-sm-2\" for=\"email\">mobile No:</label>\n");
      out.write("                    <div class=\"col-sm-10\">\n");
      out.write("                        <input type=\"number\" class=\"form-control\" id=\"email\" placeholder=\"Enter mobile no\" name=\"mobile\" value=\"");
      out.print(t1.getMobile());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("   \n");
      out.write("\n");
      out.write("                <div class=\"form-group\"> \n");
      out.write("                    <div class=\"col-sm-offset-2 col-sm-10\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-default\">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                ");
}}
                    catch(Exception ex){
                            
                            
                }
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
