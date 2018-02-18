package chapter5;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class select extends HttpServlet {

    public void doPost(
            HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            request.setCharacterEncoding("UTF-8");

            String count = request.getParameter("count");
            String payment = request.getParameter("payment");
            String review = request.getParameter("review");
            String mail = request.getParameter("mail");

            Page.header(out);
            out.println("<p>" + count + "個の商品をカートに入れました。</p>");
            out.println("<p>お支払い方法を" + payment + "に設定しました。</p>");
            out.println("<p>ご感想ありがとうございます。</p>");
            out.println("<p>[" + review + "]</p>");
            if (mail != null) {
                out.println("メールをお送りします。");
            }
                else{
            out.println("メールをお送りしません。");
            }
                Page.footer(out);
            }

    }}
