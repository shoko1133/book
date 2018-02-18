/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shochan
 */
public class Page extends HttpServlet {
    public static void header(PrintWriter out) {
        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print("<head>");
        out.print("<meta charset='UTF-8'>");
        out.print("<title>Servlet/JSP Sample Programs</title>");
        out.print("</head>");
        out.print("<body>");

    }

    public static void footer(PrintWriter out) {
        out.print("</body>");
        out.print("</html>");
    }
}
