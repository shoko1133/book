package chapter5;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class total extends HttpServlet {

    public void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            request.setCharacterEncoding("UTF-8");
            int price = Integer.parseInt(request.getParameter("price"));
            int count = Integer.parseInt(request.getParameter("count"));
            int delivary = Integer.parseInt(request.getParameter("delivary"));

            Page.header(out);
            out.println(price + "円×");
            out.println(count + "個+");
            out.println(delivary + "円");
            out.println(price * count + delivary + "円");
            Page.footer(out);
        } catch (NumberFormatException e) {
            System.out.println("数値を入力してください");
        }

    }
}
