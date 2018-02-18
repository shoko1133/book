/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(urlPatterns = {"/chapter14/search"})
public class Search extends HttpServlet {

    public void doPost(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            Page.header(out);
            try {
                String keyword = request.getParameter("keyword");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/GEEKJOB_db", "GEEKJOB", "1234");
                PreparedStatement st = con.prepareStatement("SELECT * FROM product WHERE name LIKE ?");
                st.setString(1, "%" + keyword + "%");
                ResultSet rs = st.executeQuery();

                while (rs.next()) {
                    out.println(rs.getInt("id"));
                    out.println(":");
                    out.println(rs.getString("name"));
                    out.println(":");
                    out.println(rs.getString("price"));
                    out.println("<br>");
                }
                st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace(out);
            }
            Page.footer(out);
        }
    }
}
