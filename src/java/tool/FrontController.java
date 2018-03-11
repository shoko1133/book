package tool;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

//1 urlパターンの指定
@WebServlet(urlPatterns = {"*.action"})
public class FrontController extends HttpServlet {

    //2　
    public void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            //3
            String path = request.getServletPath().substring(1);
            //4
            String name = path.replace(".a", "A").replace('/', '.');
            //5
            Action action = (Action)Class.forName(name).newInstance();
            String url = action.execute(request, response);
            request.getRequestDispatcher(url).
                    forward(request, response);
        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }

    public void doGet(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
