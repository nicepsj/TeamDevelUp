/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2023-01-26 00:45:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

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

      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    /* 개인회원 로그인 */\n");
      out.write("    function checkUsrSubmit() {\n");
      out.write("      var ID = $('#frmUsr #USR_ID');\n");
      out.write("      var PW = $('#frmUsr #PW');\n");
      out.write("      if (!ID.val()) {\n");
      out.write("        alert('ID를 입력하세요.');\n");
      out.write("        ID.focus();\n");
      out.write("        return false;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if (!PW.val()) {\n");
      out.write("        alert('비밀번호를 입력하세요.');\n");
      out.write("        PW.focus();\n");
      out.write("        return false;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      if ($(\"#remember\").is(\":checked\")) {\n");
      out.write("        var userInputId = $(\"#USR_ID\").val();\n");
      out.write("        setCookie(\"userInputId\", userInputId, 60);\n");
      out.write("        setCookie(\"setCookieYN\", \"Y\", 60);\n");
      out.write("      } else {\n");
      out.write("        deleteCookie(\"userInputId\");\n");
      out.write("        deleteCookie(\"setCookieYN\");\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      return true;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    //아이디저장\n");
      out.write("\n");
      out.write("    window.onload = function () {\n");
      out.write("      var userInputId = getCookie(\"userInputId\");\n");
      out.write("      var setCookieYN = getCookie(\"setCookieYN\");\n");
      out.write("\n");
      out.write("      if (setCookieYN == 'Y') {\n");
      out.write("        $(\"#remember\").prop(\"checked\", true);\n");
      out.write("      } else {\n");
      out.write("        $(\"#remember\").prop(\"checked\", false);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      $(\"#USR_ID\").val(userInputId);\n");
      out.write("\n");
      out.write("      var err = '';\n");
      out.write("      if (err) { //로그인 실패 메세지 발생\n");
      out.write("        if (err === 'user_not_found') {\n");
      out.write("          toastr.warning('사용자를 찾을 수 없습니다.');\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    //쿠키값 Set\n");
      out.write("    function setCookie(cookieName, value, exdays) {\n");
      out.write("      var exdate = new Date();\n");
      out.write("      exdate.setDate(exdate.getDate() + exdays);\n");
      out.write("      var cookieValue = escape(value) + ((exdays == null) ? \"\" : \"; expires=\" +\n");
      out.write("        exdate.toGMTString());\n");
      out.write("      document.cookie = cookieName + \"=\" + cookieValue;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //쿠키값 Delete\n");
      out.write("    function deleteCookie(cookieName) {\n");
      out.write("      var expireDate = new Date();\n");
      out.write("      expireDate.setDate(expireDate.getDate() - 1);\n");
      out.write("      document.cookie = cookieName + \"= \" + \"; expires=\" + expireDate.toGMTString();\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    //쿠키값 가져오기\n");
      out.write("    function getCookie(cookie_name) {\n");
      out.write("      var x, y;\n");
      out.write("      var val = document.cookie.split(';');\n");
      out.write("\n");
      out.write("      for (var i = 0; i < val.length; i++) {\n");
      out.write("        x = val[i].substr(0, val[i].indexOf('='));\n");
      out.write("        y = val[i].substr(val[i].indexOf('=') + 1);\n");
      out.write("        x = x.replace(/^\\s+|\\s+$/g, ''); // 앞과 뒤의 공백 제거하기\n");
      out.write("\n");
      out.write("        if (x == cookie_name) {\n");
      out.write("          return unescape(y); // unescape로 디코딩 후 값 리턴\n");
      out.write("        }\n");
      out.write("      }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("</script>         \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<!-- content -->\n");
      out.write("<div id=\"contents\">\n");
      out.write("  <!-- title -->\n");
      out.write("  <div class=\"sub_top center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h1>로그인</h1>\n");
      out.write("      <p>온고에 오신 것을 환영합니다.</p>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- //title -->\n");
      out.write("  <!-- 로그인 -->\n");
      out.write("  <div class=\"login_container container\">\n");
      out.write("   \n");
      out.write("    <div class=\"tab-content\">\n");
      out.write("        <div class=\"login_wrap\">\n");
      out.write("          <div class=\"login_section all\">\n");
      out.write("                <form id=\"frmUsr\" action=\"/ongo/member/login.do\" method=\"post\" onsubmit=\"return checkUsrSubmit()\">\n");
      out.write("              <input type=\"hidden\" id=\"USR_TP\" name=\"TP\" value=\"USR\" />\n");
      out.write("              <div class=\"input-group\">\n");
      out.write("              <!--name=\"member_id\"=> dto에서 정의한 멤버변수  VALUE값 쿠키값으로 설정-->\n");
      out.write("                <label for=\"USR_ID\" class=\"form-label\">아이디</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"USR_ID\" name=\"member_id\" placeholder=\"아이디를 입력해주세요.\" value=\"\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"input-group\">\n");
      out.write("                 <!-- name=\"member_pw\" => dto에서 정의한 멤버변수  -->\n");
      out.write("                <label for=\"PW\" class=\"form-label\">비밀번호</label>\n");
      out.write("                <input type=\"password\" class=\"form-control\" id=\"PW\" name=\"member_pw\" placeholder=\"비밀번호를 입력해주세요.\"\n");
      out.write("                  value=\"\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-check\">\n");
      out.write("                <input type=\"checkbox\" name=\"remember\" id=\"remember\" class=\"form-check-input\">\n");
      out.write("                <label for=\"remember\" class=\"form-check-label\"><span class=\"checkbox\"></span>아이디저장</label>\n");
      out.write("              </div>\n");
      out.write("              <button type=\"submit\" class=\"btn btn-primary btn-full\">로그인</button>\n");
      out.write("              <div class=\"text-center login_bottom\">\n");
      out.write("                 <span><a href=\"/ongo/member/findid\" >아이디찾기</a></span>\n");
      out.write("                <span><a href=\"/ongo/member/pass\" >비밀번호찾기</a></span>\n");
      out.write("                <span><a href=\"/ongo/member/join1.do\" class=\"blue\" >회원가입</a></span>\n");
      out.write("              </div>\n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      \n");
      out.write("    </div>\n");
      out.write("  </div><!-- // content -->\n");
      out.write("\n");
      out.write("<!-- Footer -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/footer.jsp", out, false);
      out.write("\n");
      out.write("<!-- //Footer -->\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
