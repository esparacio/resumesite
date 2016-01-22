package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class port_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_import_url_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_import_url_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_import_url_nobody.release();
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
      out.write("    \n");
      out.write(" \n");
      out.write(" ");
      if (_jspx_meth_c_import_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <a href=\"index.html\"><img class=\"logo\" src=\"images/logospace.png\" alt=\"logo\"></a>\n");
      out.write("        <h2>Portfolio</h2>\n");
      out.write("        <div id =\"horizontal\">\n");
      out.write("                <ul id=\"navbar\">\n");
      out.write("                    <li><a href=\"edu.jsp\">EDUCATION</a></li>\n");
      out.write("                    <li><a href=\"csskills.jsp\">COMPUTER SKILLS</a></li>\n");
      out.write("                    <li><a href=\"exp.jsp\">EXPERIENCES</a></li>\n");
      out.write("                    <li><a href=\"port.jsp\">PORTFOLIO</a></li>\n");
      out.write("                    <li><a href=\"pdfs/resume.pdf\">RESUME</a></li>\n");
      out.write("                    <li><a href=\"contact.jsp\">CONTACT ME</a></li>\n");
      out.write("                    \n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <section class=\"web\">\n");
      out.write("            <h3>Personal Website</h3>\n");
      out.write("            <p class=\"para\">I challenged myself to build this website within a week, and it took\n");
      out.write("                me 72 hours to beat the challenge. <b>This website is built from scratch.</b> You\n");
      out.write("                can see what it started like <a class=\"button\" href='before.html'><b>HERE.</b></a> The website uses my skills \n");
      out.write("            in Web Development, jQuery, Responsive Web Design, Servlets/JSPs, \n");
      out.write("            object-oriented programming, databases, JDBC, user interfaces, web architecture concepts,\n");
      out.write("            MCV design patterns, debugging, etc. It utilizes the languages Java, HTML, CSS, EL, JavaScript, and SQL.</p>\n");
      out.write("             <p class=\"para\">To see my abilities with Servlets/JSPs, databases, JDBC, and MCV design patterns in action,\n");
      out.write("                 <b><a class=\"button\" href=\"data.jsp\">CLICK HERE</a></b> for a database demo.</p>\n");
      out.write("            <p class=\"para\">I uploaded my code for the website onto my GitHub account, so feel free to take a look at the \n");
      out.write("              code. </p>\n");
      out.write("        </section>\n");
      out.write("            <section class=\"mob\">\n");
      out.write("            <h3>Mobile: Around Campus App</h3>\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/homepageicons.png\" alt=\"mobile\">\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/achome.png\" alt=\"home\">\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/ac1.png\" alt=\"work\">\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/ac2hours.png\" alt=\"hours\">\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/ac3map.png\" alt=\"map\">\n");
      out.write("            </section>\n");
      out.write("       \n");
      out.write("        <section class=\"re\">\n");
      out.write("            <h3>Research</h3>\n");
      out.write("            <img class=\"research\" src=\"images/research/presentation.jpg\" alt=\"present\">\n");
      out.write("            <img class='research' src=\"images/research/cubielights.jpg\" alt=\"cube\">\n");
      out.write("            <img class=\"research\" src=\"images/research/cubecode.png\" alt=\"code\">\n");
      out.write("            <img class=\"research\" src=\"images/research/cube1.jpg\" alt=\"cube1\">\n");
      out.write("            <img class=\"research\" src=\"images/research/cube2.jpg\" alt=\"cube2\">\n");
      out.write("            <img class=\"research\" src=\"images/research/cube3.jpg\" alt=\"cube3\">\n");
      out.write("            <img class=\"research\" src=\"images/research/cube4.jpg\" alt=\"cube4\">\n");
      out.write("            <img class=\"research\" src=\"images/research/cube5.jpg\" alt=\"cube5\">\n");
      out.write("        </section>\n");
      out.write("         <section class=\"mob2\">\n");
      out.write("            <h3>Mobile: Secret Santa App</h3>\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/sshome.png\" alt=\"sshome\">\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/ss1.png\" alt=\"ss1\">\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/ss2.png\" alt=\"ss2\">\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/ss3.png\" alt=\"ss3\">\n");
      out.write("            <img class=\"mobile\" src=\"images/mobile/ss4.png\" alt=\"ss4\">\n");
      out.write("        </section>\n");
      out.write("            \n");
      out.write("       \n");
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

  private boolean _jspx_meth_c_import_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_import_0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _jspx_tagPool_c_import_url_nobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_import_0.setPageContext(_jspx_page_context);
    _jspx_th_c_import_0.setParent(null);
    _jspx_th_c_import_0.setUrl("/includes/header.html");
    int[] _jspx_push_body_count_c_import_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_import_0 = _jspx_th_c_import_0.doStartTag();
      if (_jspx_th_c_import_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_import_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_import_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_import_0.doFinally();
      _jspx_tagPool_c_import_url_nobody.reuse(_jspx_th_c_import_0);
    }
    return false;
  }
}
