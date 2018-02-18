package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class select_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"select\" method=\"post\">\n");
      out.write("            <p>購入数を入力してください</p>\n");
      out.write("            <select name = count>\n");
      out.write("                <option value=\"1\">1</option>\n");
      out.write("                <option value=\"2\">2</option>\n");
      out.write("                <option value=\"3\">3</option>\n");
      out.write("                <option value=\"4\">4</option>\n");
      out.write("                <option value=\"5\">5</option>\n");
      out.write("            </select> \n");
      out.write("            \n");
      out.write("            <p>購入方法を入力してください</p>\n");
      out.write("            <input type=\"radio\" name=\"payment\" value=\"カード\" checked>カード\n");
      out.write("            <input type=\"radio\" name=\"payment\" value=\"代金引換\" checked>代金引換\n");
      out.write("            <input type=\"radio\" name=\"payment\" value=\"銀行振込\" checked>銀行振込\n");
      out.write("            <input type=\"radio\" name=\"payment\" value=\"コンビニ\" checked>コンビニ\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <p>商品のご感想をお寄せください</p>\n");
      out.write("            <p><textarea name=\"review\" cols=\"30\" rows=\"5\">商品名：</textarea></p>\n");
      out.write("            \n");
      out.write("            <p>お知らせメールの受信を希望されますか？</p>\n");
      out.write("            <p><input type=\"checkbox\" name=\"mail\">おすすめ商品のメールを受け取る</p>\n");
      out.write("            \n");
      out.write("            <p><input type=\"submit\" value=\"確定\"></p>\n");
      out.write("\n");
      out.write("        </form>\n");
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
