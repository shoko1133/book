package chapter14;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.naming.Context;
import javax.naming.InitialContext;

@WebServlet(urlPatterns = {"/chapter14/testdb"})
public class testdb extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        //response.setContentType("text/html; charset=UTF-8");
        Page.header(out);
        try {
            Context ic = new InitialContext();
            DataSource ds = (DataSource)ic.lookup("java:comp/env/jdbc/book");
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            //Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/GEEKJOB_db", "GEEKJOB", "1234");
            try (Connection con = ds.getConnection()) {
            PreparedStatement st = con.prepareStatement("select * from product");
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
            }

        } catch (Exception e) {
            e.printStackTrace(out);
        }
        Page.footer(out);
    }
}
