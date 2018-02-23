/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

import bean.Product;
//データソース処理をDAOクラスに任せている。
import dao.ProductDAO;
import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.List;




@WebServlet(urlPatterns = {"/chapter15/search"})
public class Search extends HttpServlet {

    public void doPost(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
            Page.header(out);
            try{
                String keyword=request.getParameter("keyword");
                
                ProductDAO dao=new ProductDAO();
                List <Product> list =dao.search(keyword);
                    for (Product p: list) {
                        out.println(p.getId());
                        out.println(":");
                        out.println(p.getName());
                        out.println(":");
                        out.println(p.getPrice());
                        out.println("<br>");
                    }
                   
                
            } catch (Exception e) {
                e.printStackTrace(out);
            }
            Page.footer(out);
        }
    }
