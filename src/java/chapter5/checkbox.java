package chapter5;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class checkbox extends HttpServlet {

    public void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            request.setCharacterEncoding("UTF-8");
            String[] genre = request.getParameterValues("genre");

            Page.header(out);
            if (genre != null) {
                for (String item : genre) {
                    out.print("[" + item + "]");
                }
                out.println("に関する情報を送ります。");
            } else {
                out.print("お買い得情報はありません。");
            }
            Page.footer(out);
        }

    }
}
