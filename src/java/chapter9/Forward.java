package chapter9;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;


@WebServlet(urlPatterns={"/chapter9/foward"})
public class Forward extends HttpServlet{
    
    public void doGet(
            HttpServletRequest request,HttpServletResponse response
    )throws ServletException, IOException{
        request.getRequestDispatcher("foward.jsp").forward(request,response);
}
}