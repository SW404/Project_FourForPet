/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2022-05-18 01:03:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.pet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class read_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\t#page article {\r\n");
      out.write("\t\tpadding:30px;\r\n");
      out.write("\t\tdisplay:flex;\r\n");
      out.write("\t\twidth:1200px;\r\n");
      out.write("\t\tjustify-content:center;\r\n");
      out.write("\t\tmargin:0px auto;\r\n");
      out.write("\t\tborder: 1px solid #aeaeae;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#dimage {\r\n");
      out.write("\t\twidth:500px; height:400px;\r\n");
      out.write("\t\tpadding:10px;\r\n");
      out.write("\t\tborder-right:1px solid #cecece;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.dicRead_content {\r\n");
      out.write("\t\twidth:600px;\r\n");
      out.write("\t\ttext-align:left;\r\n");
      out.write("\t\tfont-size:18px;\r\n");
      out.write("\t\tfont-family: 'SBAggroL';\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.dicRead_content li {\r\n");
      out.write("\t\tpadding:10px;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<div style=\"text-align:center;position: relative; margin-bottom:70px;\">\r\n");
      out.write("\t<img src=\"/resources/dog_img/dictionary_banner.png\" style=\"height:500px; width:100%;\">\r\n");
      out.write("\t<div class=\"body_banner\"> \r\n");
      out.write("\t\t<div class=\"heading\">\r\n");
      out.write("\t\t  <div>\r\n");
      out.write("\t\t    <p id=\"banner_top\" class=\"slide-up\">All PET</p>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"notosanskr\">\r\n");
      out.write("\t\t    <p id=\"banner_bottom\" class=\"slide-up\">반려동물의 정보들을 신속하게 알려드립니다</p>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div id=\"header_board\">\r\n");
      out.write("\t<a id=\"freeBoard\" href=\"/pet/list\">반려 지식백과</a>\r\n");
      out.write("\t<a id=\"petStar\" href=\"/symptom/list\">증상 지식백과</a>\r\n");
      out.write("</div>\r\n");
      out.write("<div id=\"page\"> \r\n");
      out.write("\t<p class=\"small_title\">반려 지식백과</p>\r\n");
      out.write("\t<p class=\"big_title\">함께 살 반려동물들을 알아보세요 </p>\r\n");
      out.write("\t<article>\r\n");
      out.write("\t\t<div><img id=\"dimage\" src=\"/display?fileName=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.dimage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"></div>\r\n");
      out.write("\t\t<ul class=\"dicRead_content\">\r\n");
      out.write("\t\t\t<li><b>품  종</b> : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.dtitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("\t\t\t<li><b>특  징</b> : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.dchar}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("\t\t\t<li><b>수  명</b> : ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.dlife}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("\t\t\t<li><b>히스토리</b><br>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.dcontent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</li>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</article>\r\n");
      out.write("</div>\r\n");
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