/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.37
 * Generated at: 2023-03-28 07:31:05 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class book_002dform_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>BOOK-FORM</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        /* Box styling */\r\n");
      out.write("form {\r\n");
      out.write("    background-color: #f9f9f9;\r\n");
      out.write("    margin: 50px auto;\r\n");
      out.write("        padding: 20px;\r\n");
      out.write("        border: 1px solid #ccc;\r\n");
      out.write("        border-radius: 5px;\r\n");
      out.write("        background-color: #f7f7f7;\r\n");
      out.write("        text-align: center;\r\n");
      out.write("        width: 400px;\r\n");
      out.write("    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.3);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Field styling */\r\n");
      out.write("  label {\r\n");
      out.write("    display: block;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("    color: #333;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  input[type=\"text\"] {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 8px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.1);\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Submit button styling */\r\n");
      out.write("  input[type=\"submit\"] {\r\n");
      out.write("    background-color: #4861f0;\r\n");
      out.write("    color: white;\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    transition: background-color 0.3s ease;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  input[type=\"submit\"]:hover {\r\n");
      out.write("    background-color: #2844e2;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  /* Field focus styling */\r\n");
      out.write("  input[type=\"text\"]:hover {\r\n");
      out.write("    outline: #2844e2;\r\n");
      out.write("    background-color:rgb(197, 202, 202) ;\r\n");
      out.write("    color: black;\r\n");
      out.write("    box-shadow: 0px 2px 5px rgba(0, 0, 0, 0.3);\r\n");
      out.write("  }\r\n");
      out.write("  form:hover{\r\n");
      out.write("    box-shadow: 0px 0px 20px rgba(0,0,0,0.5);\r\n");
      out.write("    border: 1px solid #999;\r\n");
      out.write("  }\r\n");
      out.write("  .form-group {\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <div class=\"form-group\">\r\n");
      out.write("    <form method=\"post\" action=\"saveCustomer\">\r\n");
      out.write("        <label>BOOK ID</label>\r\n");
      out.write("        <input type=\"text\" class=\"id\" name=\"id\"><br>\r\n");
      out.write("        <label>BOOK TITTLE</label>\r\n");
      out.write("        <input type=\"text\" class=\"title\" name=\"title\" ><br>\r\n");
      out.write("        <label>BOOK AUTHOR</label>\r\n");
      out.write("        <input type=\"text\" class=\"author\" name=\"author\" ><br>\r\n");
      out.write("        <label>BOOK PRICE</label>\r\n");
      out.write("        <input type=\"text\" class=\"price\" name=\"price\" ><br>\r\n");
      out.write("        <input type=\"submit\" class=\"submit\" name=\"\">\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("   </div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
