package chapter17;
//商品を追加するサーブレット。

import bean.Product;
import tool.Page;
import java.util.ArrayList;
import java.util.List;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.http.HttpServlet;


@WebServlet(urlPatterns = {"/chapter17/cart-add"})
public class CartAdd extends HttpServlet {
    
    @SuppressWarnings("unchecked")
    public void doPost(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);
        
        String name = request.getParameter("name");
        int price = Integer.parseInt(request.getParameter("price"));
        //セッションを開始
        HttpSession session = request.getSession();

        //cartの名前をもつ属性を取得cartに代入。
        List<Product> cart = (List<Product>) session.getAttribute("cart");
        //取得できない場合nullを返したら新たなリストを作成します。
        if (cart == null) {
            cart = new ArrayList<Product>();
        }
        
        //Productクラスのオブジェクトを作成しリクエストパラメーターから取得した商品名と価格を設定しリストに追加。
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        cart.add(p);
        
        //cartという名前にセッション属性にリストを設定します。
        session.setAttribute("cart", cart);
        
        out.println("追加しました");
        Page.footer(out);
    }
}
