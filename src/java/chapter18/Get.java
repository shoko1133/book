package chapter18;

import tool.Page;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/chapter18/get"})
public class Get extends HttpServlet {

    @SuppressWarnings("unchecked")
    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                String name = cookie.getName();
                String value = cookie.getValue();
                out.println("<p>" + name + ":" + value + "</p>");
            }
        } else {
            out.println("null");

        }
        Page.footer(out);
    }
}
