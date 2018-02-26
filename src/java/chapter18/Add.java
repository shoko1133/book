package chapter18;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;

@WebServlet(urlPatterns = {"/chapter18/add"})
public class Add extends HttpServlet {

    @SuppressWarnings("unchecked")
    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        String name = "name";
        String value = "value";
        Cookie cookie = new Cookie(name, value);
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);
    }
}
