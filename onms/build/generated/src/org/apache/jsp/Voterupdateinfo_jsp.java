package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Voterupdateinfo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title> Voter Details Update</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"cssandjavascript/button.css\">\n");
      out.write("       <link rel=\"stylesheet\" type=\"text/css\" href=\"cssandjavascript/textbox.css\"> \n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"/vt1\" method=\"post\">\n");
      out.write("      <table  width=\"320\" height=\"5\" border=\"\" align=\"center\" cellpadding=\"\" cellspacing=\"\" bordercolor=\"#000000\" bgcolor=\"#00FF66\"  hspace=\"3\" vspace=\"3\">\n");
      out.write("  \n");
      out.write("            \n");
      out.write("               \n");
      out.write("          ");
  
          
           String username =(String)session.getAttribute("username");
          
          Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/onms_db","root","mukesh");
             Statement stmt=con.createStatement();
                    ResultSet rs= stmt.executeQuery("select * from votereg where username='"+username+"'");

          rs.next();
            
                
      out.write("\n");
      out.write("               \n");
      out.write("               \n");
      out.write("                \n");
      out.write("           \n");
      out.write("              \n");
      out.write("            \n");
      out.write("           \n");
      out.write("  <tr>\n");
      out.write("    <th width=\"170\" bgcolor=\"#009966\" scope=\"col\"> User details</th>\n");
      out.write("    <th width=\"144\" bgcolor=\"#009966\" scope=\"col\"> Values</th>\n");
      out.write("  </tr>\n");
      out.write(" \n");
      out.write("  <tr>\n");
      out.write("  \n");
      out.write("  <td align=\"center\">User Name</td>\n");
      out.write("  <td>\n");
      out.write("      <input name=\"username\" class=\"textbox\"   type=\"text\" id=\"username\" value=\"");
      out.print(rs.getString(1));
      out.write("\" />\n");
      out.write("  </td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">Name</td>\n");
      out.write("    <td><input name=\"name\"  type=\"text\"  class=\"textbox\" id=\"name\" value=\"");
      out.print(rs.getString(2));
      out.write("\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">Address   </td>\n");
      out.write("    <td><input name=\"address\" type=\"text\" class=\"textbox\"  id=\"address\" value=\"");
      out.print(rs.getString(3));
      out.write("\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">District</td>\n");
      out.write("    <td><input name=\"dist\" type=\"text\" id=\"dob\"  class=\"textbox\" value=\"");
      out.print(rs.getString(4));
      out.write("\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\"> Date Of Birth</td>\n");
      out.write("    <td><input name=\"dob\" type=\"text\" id=\"dist\" class=\"textbox\"  value=\"");
      out.print(rs.getString(5));
      out.write("\" placeholder=\"yyyy-mm-dd\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><div align=\"center\">Consituency</td>\n");
      out.write("    <td><input name=\"Consituency\" type=\"text\" class=\"textbox\"  id=\"username6\" value=\"");
      out.print(rs.getString(6));
      out.write("\" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">Email</td>\n");
      out.write("    <td><input name=\"email\" type=\"text\"  class=\"textbox\" id=\"email\"  value=\"");
      out.print(rs.getString(8));
      out.write("\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">Phone Number </td>\n");
      out.write("    <td><input name=\"phno\" type=\"text\" id=\"phno\"  class=\"textbox\"  value=\"");
      out.print(rs.getString(9));
      out.write("\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">VoterId</td>\n");
      out.write("    <td><input name=\"voterid\" type=\"text\" id=\"voterid\"  class=\"textbox\" value=\"");
      out.print(rs.getString(10));
      out.write("\" readonly /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td align=\"center\">Gender </td>\n");
      out.write("    <td><input name=\"gender\" type=\"text\" id=\"gender\" class=\"textbox\"  value=\"");
      out.print(rs.getString(11));
      out.write("\"/></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr> \n");
      out.write("    <td align=\"center\">Age</td>\n");
      out.write("    <td><input name=\"age\" type=\"text\" id=\"age\"  class=\"textbox\" value=\"");
      out.print(rs.getString(12));
      out.write("\" /></td>\n");
      out.write("  </tr>\n");
      out.write("   <tr> \n");
      out.write("       <td colspan=\"2\" align=\"center\"><input name=\"submit\" type=\"submit\" class=\"myButton\" id=\"submit\" value=\"Update\" onclick=\"return confirm('Do you really want to submit the form?');\"  /></td>\n");
      out.write("  </tr>\n");
      out.write("</table>\n");
      out.write("          \n");
      out.write("             \n");
      out.write("       \n");
      out.write("            <form>\n");
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
