package chapter17;
//商品を追加するサーブレット。

import bean.Product;
import tool.Page;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = {"/chapter17/cart-get"})
public class CartGet extends HttpServlet {

    @SuppressWarnings("unchecked")
    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        Page.header(out);

        //session取得
        HttpSession session=request.getSession();

        //リストを取得
        List<Product> cart=(List<Product>)session.getAttribute("cart");
        
        //取得したリストから全ての商品を取り出す。
        for (Product p : cart) {
            out.println("<p>");
            out.println(p.getName());
            out.println(p.getPrice());
            out.println("</p>");
        }

        Page.footer(out);
    }
}
