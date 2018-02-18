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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.*;

@WebServlet(urlPatterns = {"/chapter14/transaction"})
public class Transaction extends HttpServlet {

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
                
                
                con.setAutoCommit(false);
                
                
                PreparedStatement st = con.prepareStatement("insert into product values(null,?,?)");
                st.setString(1, name);
                st.setInt(2, price);
                
                int line = st.executeUpdate();
                
                
                st=con.prepareStatement("select * from product where name=?");
                st.setString(1, name);
                ResultSet rs = st.executeQuery();
                int line1=0;
                while(rs.next()){
                    line1++;
                }
                
                if(line1==1){
                    con.commit();
                    out.println("追加");
                }else{
                con.rollback();
                out.println("登録済み");
                }
            
                con.setAutoCommit(true);
                
            st.close();
                con.close();
            } catch (Exception e) {
                e.printStackTrace(out);
            }
            Page.footer(out);
        }
    }
}