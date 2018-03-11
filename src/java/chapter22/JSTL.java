package chapter22;

import bean.Product;
import dao.ProductDAO;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/chapter22/jstl"})
public class JSTL extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        try{
            ProductDAO dao=new ProductDAO();
            List<Product> list=dao.search("");
            
            request.setAttribute("list", list);
            
            request.getRequestDispatcher("jstl.jsp").forward(request, response);
        }catch(Exception e){
        e.printStackTrace(out);
        }
        
    }
    
    }