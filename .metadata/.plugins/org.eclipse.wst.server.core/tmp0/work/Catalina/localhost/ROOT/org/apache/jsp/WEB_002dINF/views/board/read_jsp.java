/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.5
 * Generated at: 2022-05-18 10:37:39 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class read_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/C:/git/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/project01/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1647577167351L));
    _jspx_dependants.put("jar:file:/C:/git/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/project01/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153352682000L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link href=\"/resources/board.css\" rel=\"stylesheet\" >\r\n");
      out.write("\r\n");
      out.write("<div style=\"text-align:center;position: relative; margin-bottom:70px;\">\r\n");
      out.write("\t<img src=\"/resources/board_banner.png\" style=\"height:500px; width:100%;\">\r\n");
      out.write("\t<div class=\"body_banner\"> \r\n");
      out.write("\t\t<div class=\"heading\">\r\n");
      out.write("\t\t  <div>\r\n");
      out.write("\t\t    <p id=\"banner_top\" class=\"slide-up\">게시판</p>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t  <div class=\"notosanskr\">\r\n");
      out.write("\t\t    <p id=\"banner_bottom\" class=\"slide-up\">다양한 이야기들을 적어 함께 공유해주세요</p>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div> \r\n");
      out.write("</div>\r\n");
      out.write("<header style=\"text-align:center;\">\r\n");
      out.write("\t<div id=\"header_board\">\r\n");
      out.write("\t\t<a id=\"freeBoard\" href=\"/board/list\">자유게시판</a>\r\n");
      out.write("\t\t<a id=\"petStar\" href=\"/mypet/list\">펫스타그램</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p class=\"small_title\">자유게시판</p>\r\n");
      out.write("\t<p class=\"big_title\">자유롭게 정보를 공유하세요</p>\r\n");
      out.write("</header>\r\n");
      out.write("\r\n");
      out.write("<article id=\"board_readUser\" style=\"width: 900px; margin:0px auto; text-align:left;\">\r\n");
      out.write("\t<a href=\"/board/list?page=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.page}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("&keyword=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.keyword}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">목록이동</a>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"boardRead_nav\">\r\n");
      out.write("\t\t<div style=\"font-size:18px;\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.btitle}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t<div><label>작성일 |</label>&nbsp;");
      if (_jspx_meth_fmt_005fformatDate_005f0(_jspx_page_context))
        return;
      out.write("</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"boardRead_nav2\">\r\n");
      out.write("\t\t<div>작성자: ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bwriter}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</div>\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<p class=\"board_userContent\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bcontent}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</p>\r\n");
      out.write("\t<img src=\"/resources/edit.png\" width=20>\r\n");
      out.write("\t<label>댓글입력</label>\r\n");
      out.write("\t<div class=\"comment_box\">\r\n");
      out.write("\t\t<textarea rows=4 cols=115 id=\"brreply\"></textarea>\r\n");
      out.write("\t\t<button id=\"insert\">댓글 입력</button>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class=\"comment_title\">Comments</div>\r\n");
      out.write("\t<div id=\"breplies\"></div>\r\n");
      out.write("\t<script id=\"temp\" type=\"text/x-handlebars-template\">\r\n");
      out.write("\t\t{{#each brlist}}\r\n");
      out.write("\t\t\t<div class=\"row\" brno=\"{{brno}}\">\r\n");
      out.write("\t\t\t\t<div style=\"display:flex; justify-content:space-between;\">\r\n");
      out.write("\t\t\t\t\t<label>{{brreplyer}} {{brreplydate}}</label>\r\n");
      out.write("\t\t\t\t\t<div style=\"display:{{display brreplyer}}\">\r\n");
      out.write("\t\t\t\t\t\t<a class=\"update\">수정</a>\r\n");
      out.write("\t\t\t\t\t\t<a class=\"delete\">삭제</a>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<textarea rows=3 cols=125 class=\"brreply\" {{read brreplyer}}>{{brreply}}</textarea>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t{{/each}}\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<script>\r\n");
      out.write("\t\t\tHandlebars.registerHelper(\"display\", function(brreplyer){\r\n");
      out.write("\t\t\t\tif(brreplyer!=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"){\r\n");
      out.write("\t\t\t\t\tvar btn=$(\"#board_upadte_btn\");\r\n");
      out.write("\t\t\t\t\tbtn.css({\r\n");
      out.write("\t\t\t\t\t\t\"display\" : \"none\"\r\n");
      out.write("\t\t\t\t\t});\r\n");
      out.write("\t\t\t\t\treturn \"none\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tHandlebars.registerHelper(\"read\", function(brreplyer){\r\n");
      out.write("\t\t\t\tif(brreplyer!=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"){\r\n");
      out.write("\t\t\t\t\treturn \"readonly\";\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t<div class=\"pagination\"></div>\r\n");
      out.write("</article>\r\n");
      out.write("<script>\r\n");
      out.write("\tvar bno = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\tvar page = 1;\r\n");
      out.write("\tgetList();\r\n");
      out.write("\t\r\n");
      out.write("\t$(\"#bdelete\").on(\"click\", function(){\r\n");
      out.write("\t\tvar bno=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\tif(!confirm(bno + \"을(를) 삭제하실래요?\"))\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\tlocation.href = \"delete?bno=\" + bno;\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//댓글 수정\r\n");
      out.write("\t$(\"#breplies\").on(\"click\", \".update\", function(e) {\r\n");
      out.write("\t\te.preventDefault;\r\n");
      out.write("\t\tvar row = $(this).parent().parent();\r\n");
      out.write("\t\tvar brno = row.attr(\"brno\");\r\n");
      out.write("\t\tvar brreply = row.find(\".brreply\").val();\r\n");
      out.write("\t\tif(!confirm(\"댓글을 수정하실래요?\")) return;\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: \"post\",\r\n");
      out.write("\t\t\turl: \"/breply/update\",\r\n");
      out.write("\t\t\tdata: {brno:brno, brreply:brreply},\r\n");
      out.write("\t\t\tsuccess: function(){\r\n");
      out.write("\t\t\t\tgetList();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t//댓글 삭제\r\n");
      out.write("\t$(\"#breplies\").on(\"click\", \".delete\", function() {\r\n");
      out.write("\t\tvar row = $(this).parent().parent().parent();\r\n");
      out.write("\t\tvar brno = row.attr(\"brno\");\r\n");
      out.write("\t\tif(!confirm(\"댓글을 삭제하실래요?\")) return;\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype: \"post\",\r\n");
      out.write("\t\t\turl: \"/breply/delete\",\r\n");
      out.write("\t\t\tdata: {brno:brno},\r\n");
      out.write("\t\t\tsuccess: function(){\r\n");
      out.write("\t\t\t\tgetList();\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\t//댓글 등록\r\n");
      out.write("\t$(\"#insert\").on(\"click\", function() {\r\n");
      out.write("\t\tvar brreplyer = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${unickname}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\";\r\n");
      out.write("\t\tvar brreply = $(\"#brreply\").val();\r\n");
      out.write("\t\tif (brreply == \"\") {\r\n");
      out.write("\t\t\talert(\"댓글을 입력하세요!\");\r\n");
      out.write("\t\t\t$(\"#brreply\").focus();\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif (!confirm(\"댓글을 등록하실래요?\"))\r\n");
      out.write("\t\t\treturn;\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"post\",\r\n");
      out.write("\t\t\turl : \"/breply/insert\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tbno : bno,\r\n");
      out.write("\t\t\t\tbrreplyer : brreplyer,\r\n");
      out.write("\t\t\t\tbrreply : brreply\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function() {\r\n");
      out.write("\t\t\t\talert(\"댓글등록 성공!\");\r\n");
      out.write("\t\t\t\tgetList();\r\n");
      out.write("\t\t\t\t$(\"#brreply\").val(\"\");\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\tfunction getList() {\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\ttype : \"get\",\r\n");
      out.write("\t\t\turl : \"/breply/list.json\",\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\tdata : {\r\n");
      out.write("\t\t\t\tpage : page,\r\n");
      out.write("\t\t\t\tbno : bno\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(data) {\r\n");
      out.write("\t\t\t\tvar template = Handlebars.compile($(\"#temp\").html());\r\n");
      out.write("\t\t\t\t$(\"#breplies\").html(template(data));\r\n");
      out.write("\t\t\t\t//페이지목록출력\r\n");
      out.write("\t\t\t\t$(\".pagination\").html(getPagination(data));\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t//페이지 번호를 클릭한 경우\r\n");
      out.write("\t$(\".pagination\").on(\"click\", \"a\", function(e) {\r\n");
      out.write("\t\te.preventDefault();\r\n");
      out.write("\t\tpage = $(this).attr(\"href\");\r\n");
      out.write("\t\tgetList();\r\n");
      out.write("\t});\r\n");
      out.write("</script>");
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

  private boolean _jspx_meth_fmt_005fformatDate_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatDate
    org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag _jspx_th_fmt_005fformatDate_005f0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag) _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatDateTag.class);
    _jspx_th_fmt_005fformatDate_005f0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_005fformatDate_005f0.setParent(null);
    // /WEB-INF/views/board/read.jsp(34,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setValue((java.util.Date) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bregdate}", java.util.Date.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
    // /WEB-INF/views/board/read.jsp(34,33) name = pattern type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_fmt_005fformatDate_005f0.setPattern("yyyy-MM-dd");
    int _jspx_eval_fmt_005fformatDate_005f0 = _jspx_th_fmt_005fformatDate_005f0.doStartTag();
    if (_jspx_th_fmt_005fformatDate_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ffmt_005fformatDate_0026_005fvalue_005fpattern_005fnobody.reuse(_jspx_th_fmt_005fformatDate_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent(null);
    // /WEB-INF/views/board/read.jsp(39,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bwriter==unickname}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("\t\t\t<div>\r\n");
        out.write("\t\t\t\t<a onClick=\"location.href='/board/update?bno=");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${vo.bno}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
        out.write("'\">수정</a>\r\n");
        out.write("\t\t\t\t<a id=\"bdelete\">삭제</a>\r\n");
        out.write("\t\t\t</div>\r\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }
}
