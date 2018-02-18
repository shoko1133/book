package chapter14;

import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import java.sql.*;

@WebServlet(urlPatterns = {"/chapter14/insert"})
public class Insert extends HttpServlet {

    public void doPost(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            Page.header(out);
            try {
                String name = request.getParameter("name");
                int price = Integer.parseInt(request.getParameter("price"));
                
                
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8889/GEEKJOB_db", "GEEKJOB", "1234");
                
                PreparedStatement st = con.prepareStatement("insert into product values(null,?,?)");
                st.setString(1, name);
                st.setInt(2, price);
                
                int line = st.executeUpdate();
                
                if(line>0){
                    out.println("追加");
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