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

@WebServlet(urlPatterns = {"/chapter17/cart-remove"})
public class CartRemove extends HttpServlet {

    @SuppressWarnings("unchecked")
    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        //session取得
        HttpSession session = request.getSession();

        //cartを削除
        session.removeAttribute("cart");

        out.println("削除");

        Page.footer(out);
    }
}
