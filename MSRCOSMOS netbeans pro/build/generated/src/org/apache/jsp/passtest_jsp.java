package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class passtest_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html ng-app=\"app\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.7/angular.min.js\"></script>\n");
      out.write("  <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/css/bootstrap.min.css\" />\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.6/js/bootstrap.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/angular-messages/1.5.7/angular-messages.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body ng-controller=\"mainCtrl\">\n");
      out.write("  <form name=\"add_user_form\">\n");
      out.write("    <div class=\"col-md-12\">\n");
      out.write("      <div class=\"form-group\" ng-class=\"{ 'has-error' : add_user_form.user_password.$dirty && add_user_form.user_password.$invalid }\">\n");
      out.write("        <p class=\"help-text\">Enter password</p>\n");
      out.write("        <input type=\"password\" class=\"form-control\" id=\"user_password\" name=\"user_password\" placeholder=\"password\" required ng-model=\"user.user_password\" password-verify=\"{{user.confirm_password}}\">\n");
      out.write("        <div class=\"help-block\" ng-messages=\"add_user_form.user_password.$error\" ng-if=\"add_user_form.user_password.$dirty\">\n");
      out.write("          <p ng-message=\"required\">This field is required</p>\n");
      out.write("          <p ng-message=\"minlength\">This field is too short</p>\n");
      out.write("          <p ng-message=\"maxlength\">This field is too long</p>\n");
      out.write("          <p ng-message=\"required\">This field is required</p>\n");
      out.write("          <p ng-message=\"passwordVerify\">No match!</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"form-group\" ng-class=\"{ 'has-error' : add_user_form.confirm_password.$dirty && add_user_form.confirm_password.$invalid }\">\n");
      out.write("        <p class=\"help-text\">Enter matching password</p>\n");
      out.write("        <input class=\"form-control\" id=\"confirm_password\" ng-model=\"user.confirm_password\" name=\"confirm_password\" type=\"password\" placeholder=\"confirm password\" required password-verify=\"{{user.user_password}}\">\n");
      out.write("        <div class=\"help-block\" ng-messages=\"add_user_form.confirm_password.$error\" ng-if=\"add_user_form.confirm_password.$dirty\">\n");
      out.write("          <p ng-message=\"required\">This field is required</p>\n");
      out.write("          <p ng-message=\"minlength\">This field is too short</p>\n");
      out.write("          <p ng-message=\"maxlength\">This field is too long</p>\n");
      out.write("          <p ng-message=\"required\">This field is required</p>\n");
      out.write("          <p ng-message=\"passwordVerify\">No match!</p>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </form>\n");
      out.write("</body>\n");
      out.write("\n");
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
