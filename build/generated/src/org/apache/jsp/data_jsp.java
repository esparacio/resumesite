package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class data_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <script type=\"text/javascript\" src=\"js/jquery-1.12.0.js\"></script>\n");
      out.write("         <script type=\"text/javascript\" src=\"js/unslider-master/src/js/unslider.js\"></script>\n");
      out.write("         <link rel=\"stylesheet\" href=\"js/unslider-master/dist/css/unslider.css\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"js/unslider-master/dist/css/unslider-dots.css\">\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <h3>Mobile: Around Campus App</h3>\n");
      out.write("            <div class=\"slider1\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><img class=\"mobile\" src=\"images/mobile/homepageicons.png\" alt=\"mobile\"></li>\n");
      out.write("                    <li><img class=\"mobile\" src=\"images/mobile/achome.png\" alt=\"home\"></li>\n");
      out.write("                    <li><img class=\"mobile\" src=\"images/mobile/ac1.png\" alt=\"work\"></li>\n");
      out.write("                    <li><img class=\"mobile\" src=\"images/mobile/ac2hours.png\" alt=\"hours\"></li>\n");
      out.write("                    <li><img class=\"mobile\" src=\"images/mobile/ac3map.png\" alt=\"map\"></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
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
