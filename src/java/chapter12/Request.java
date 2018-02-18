package chapter12;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/chapter12/request"})
public class Request extends HttpServlet {
    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    )throws ServletException, IOException {
        PrintWriter out =response.getWriter();
        Page.header(out);
        
        //サーブレットのURLを表示
        out.println("<p>Request URL<br>"+ request.getRequestURL()+"</p>");
        //サーバーの情報を表示
        out.println("<p>Host<br>"+ request.getHeader("Host")+"</p>");
        //ブラウザの種類を表示
        out.println("<p>User-Agent<br>"+ request.getHeader("User-Agent")+"</p>");
        //IPアドレスを表示
        out.println("<p>Remote address<br>"+ request.getRemoteAddr()+"</p>");
        
        Page.footer(out);
        
    }}