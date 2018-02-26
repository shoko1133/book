package chapter16;

import bean.Product;
import dao.ProductDAO;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns={"/chapter16/attribute2"})
public class Attribute2 extends HttpServlet {
    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        try {
            //DAOを用いて全商品をProductDAOクラスのオブジェクトを生成してからsearchメソッドを呼び出します。
            ProductDAO dao = new ProductDAO();
            List<Product> list = dao.search("");
            
            //setAttributeメソッドを用いてリクエスト属性に商品のリストを設定します。
            request.setAttribute("list", list);
            //jspファイルにフォワードする。
            request.getRequestDispatcher("attribute2.jsp")
                    .forward(request, response);
        } catch (Exception e) {
            e.printStackTrace(out);
        }
    }
}
