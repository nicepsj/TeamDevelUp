/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.69
 * Generated at: 2023-01-26 03:18:35 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class joinsStep1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP?????? ?????? GET, POST ?????? HEAD ??????????????? ???????????????. Jasper??? OPTIONS ????????? ?????? ???????????????.");
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
      out.write("\n");
      out.write("<script>\n");
      out.write("function fnNext(){\n");
      out.write("  const agree1 = document.getElementById('agree1').checked;\n");
      out.write("  const agree2 = document.getElementById('agree2').checked;\n");
      out.write("\n");
      out.write("  if(agree1 && agree2){\n");
      out.write("    location.href = '/ongo/member/join3.do?state=USER';\n");
      out.write("  }else{\n");
      out.write("    toastr.warning(\"?????? ???????????? ?????? ???????????? ?????? ??????????????? ???????????? ???????????????.\")\n");
      out.write("  }\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write("function fnChk(){\n");
      out.write("  const chk = document.getElementById('remember');\n");
      out.write("  const is_checked = chk.checked;\n");
      out.write("\n");
      out.write("  var checked = document.getElementById('remember').innerText = is_checked;\n");
      out.write("\n");
      out.write("  if(checked){\n");
      out.write("    document.getElementById('agree1').checked = true;\n");
      out.write("    document.getElementById('agree2').checked = true;\n");
      out.write("  }else{\n");
      out.write("    document.getElementById('noagree1').checked = true;\n");
      out.write("    document.getElementById('noagree2').checked = true;\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("\n");
      out.write("function fnAgree(){\n");
      out.write("  const agree1 = document.getElementById('agree1').checked;\n");
      out.write("  const agree2 = document.getElementById('agree2').checked;\n");
      out.write("\n");
      out.write("  const chk = document.getElementById('remember');\n");
      out.write("  const is_checked = chk.checked;\n");
      out.write("\n");
      out.write("  if(agree1 && agree2){\n");
      out.write("    document.getElementById('remember').checked = true;\n");
      out.write("  }else{\n");
      out.write("    document.getElementById('remember').checked = false;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write(" </head>\n");
      out.write("<body>\n");
      out.write("<!-- content -->\n");
      out.write("<div id=\"contents\">\n");
      out.write("  <!-- title -->\n");
      out.write("  <div class=\"sub_top center\">\n");
      out.write("      <div class=\"login_container container\">\n");
      out.write("          <h1>????????????</h1>\n");
      out.write("          <ul class=\"step join_step\">\n");
      out.write("              <li class=\"on\" title=\"?????????\">\n");
      out.write("                  <p class=\"stepicon\"></p>\n");
      out.write("                  <p class=\"steptt\">????????????</p>\n");
      out.write("              </li>\n");
      out.write("              <!-- \n");
      out.write("              <li>\n");
      out.write("                  <p class=\"stepicon\"></p>\n");
      out.write("                  <p class=\"steptt\">????????? ??????</p>\n");
      out.write("              </li> -->\n");
      out.write("              <li>\n");
      out.write("                  <p class=\"stepicon\"></p>\n");
      out.write("                  <p class=\"steptt\">????????????</p>\n");
      out.write("              </li>\n");
      out.write("              <li>\n");
      out.write("                  <p class=\"stepicon\"></p>\n");
      out.write("                  <p class=\"steptt\">????????????</p>\n");
      out.write("              </li>\n");
      out.write("          </ul>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- //title -->\n");
      out.write("\n");
      out.write("  <!-- ????????? -->\n");
      out.write("  <div class=\"login_container container\">\n");
      out.write("    <form id=\"radioForm\" name=\"radioForm\">\n");
      out.write("      <!-- ?????? ??? ?????? -->\n");
      out.write("      <h2 class=\"visually-hidden\">????????????</h2>\n");
      out.write("      <!-- //?????? ??? ?????? -->\n");
      out.write("      <div class=\"agree d-flex\">\n");
      out.write("          <div class=\"form-check\">\n");
      out.write("            <label class=\"form-check-label\">\n");
      out.write("              <input type=\"checkbox\" name=\"remember\" id=\"remember\" class=\"form-check-input\" onclick=\"fnChk()\">\n");
      out.write("              <span class=\"checkbox\"></span><span class=\"h4\">&nbsp;???????????? ??? ???????????? ?????? ??????????????? ?????? ???????????????.</span>\n");
      out.write("            </label>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"cont-box-inner\">\n");
      out.write("          <div class=\"title\">\n");
      out.write("              <h3 class=\"h4\">????????????</h3>\n");
      out.write("              <p class=\"highlight org-txt\">* ??????????????????</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"overflow\">\n");
      out.write("              ??? 1??? ??????<br>\n");
      out.write("              ??? 1 ??? [??????]<br>\n");
      out.write("              ??? ????????? ??????(?????? \"????????? ?????????\")??? ???????????? ???????????? ?????? ?????? ???????????? ????????? ???????????? ????????? ???????????? ??????, ?????? ??? ????????????, ?????? ????????? ????????? ???????????? ???????????? ?????????.<br>\n");
      out.write("              <br>\n");
      out.write("             \n");
      out.write("              ??????<br>\n");
      out.write("                ??? ??? ????????? 2022??? 12??? 23?????? ???????????????.<br>\n");
      out.write("                ??? ????????? ????????? ??? ???????????? ???????????????.\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group float-right\">\n");
      out.write("              <div class=\"form-check\">\n");
      out.write("                <label for=\"agree1\" class=\"form-check-label\">\n");
      out.write("                  <input type=\"radio\" name=\"agree1\" id=\"agree1\" class=\"form-check-input\" onclick=\"fnAgree()\">\n");
      out.write("                  <span class=\"radio\"></span>&nbsp;???????????????.\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-check\">\n");
      out.write("                <label for=\"noagree1\" class=\"form-check-label\">\n");
      out.write("                  <input type=\"radio\" name=\"agree1\" id=\"noagree1\" class=\"form-check-input\" onclick=\"fnAgree()\" checked=\"\">\n");
      out.write("                  <span class=\"radio\"></span>&nbsp;???????????? ????????????.\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("          </div> \n");
      out.write("      </div>\n");
      out.write("      <div class=\"cont-box-inner\">\n");
      out.write("          <div class=\"title\">\n");
      out.write("              <h3 class=\"h4\">???????????? ?????? ??? ????????????</h3>\n");
      out.write("              <p class=\"highlight org-txt\">* ??????????????????</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"overflow\">\n");
      out.write("            ??????(?????? \"????????? ?????????\") ???????????? ????????? ????????????, ????????? ?????? ??????????????? ???????????????, ???????????????????????? ???????????? ????????????.\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("            <p class=\"mb10\"><strong>1. ?????? ??? ?????? ??????</strong><br>\n");
      out.write("            ????????? ????????? ???????????? ????????? ?????? ???????????? ????????? ???????????? ???????????? ??????, ?????? ??? ????????????, ?????? ????????? ????????? ???????????? ???????????? ?????????.</p>\n");
      out.write("            <p class=\"mb10\"><strong>2. ?????? ??? ?????? ??????</strong><br>\n");
      out.write("            (????????????) ??????, ??????????????????, ????????????, ?????????, ?????????, ????????????</p>\n");
      out.write("            <p class=\"mb10\"><strong>3. ?????? ??? ?????? ??????</strong><br>\n");
      out.write("            ?????? ??? ?????? ?????????????????? ?????? ?????????</p>\n");
      out.write("            - IP Address, ??????, ?????? ??????, ????????? ????????????, ????????? ?????? ???</p>\n");
      out.write("            <br>\n");
      out.write("            <p>??? ??? 14????????? ????????? ?????? ??????????????? ?????? ??? ????????????.</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"form-group float-right\">\n");
      out.write("              <div class=\"form-check\">\n");
      out.write("                <label for=\"agree2\" class=\"form-check-label\">\n");
      out.write("                  <input type=\"radio\" name=\"agree2\" id=\"agree2\" class=\"form-check-input\" onclick=\"fnAgree()\">\n");
      out.write("                  <span class=\"radio\"></span>&nbsp;???????????????.\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-check\">\n");
      out.write("                <label for=\"noagree2\" class=\"form-check-label\">\n");
      out.write("                  <input type=\"radio\" name=\"agree2\" id=\"noagree2\" class=\"form-check-input\" onclick=\"fnAgree()\" checked=\"\">\n");
      out.write("                  <span class=\"radio\"></span>&nbsp;???????????? ????????????.\n");
      out.write("                </label>\n");
      out.write("              </div>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"btn-area\">\n");
      out.write("          <button class=\"btn btn-primary btn-large\" type=\"button\" onclick=\"fnNext()\">???????????????.</button>\n");
      out.write("          <button class=\"btn btn-outline-secondary btn-large\" type=\"button\" onclick=\"location.href='/ongo/index'\">???????????? ????????????.</button>\n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- // contents -->\n");
      out.write("\n");
      out.write("      <!-- Footer -->\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../include/footer.jsp", out, false);
      out.write("\n");
      out.write("      <!-- //Footer -->\n");
      out.write("  \n");
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
