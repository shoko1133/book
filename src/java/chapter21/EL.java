package chapter21;

import bean.Product;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/chapter21/el"})
public class EL extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {

        //productオブジェクト生成
        Product p = new Product();
        p.setId(1);
        p.setName("まぐろ");
        p.setPrice(100);

        //setAttributeメソッドをつかってリクエスト属性にbeanを設定。属性名はProduct
        request.setAttribute("product", p);

        //JSPファイルにフォワード
        request.getRequestDispatcher("el.jsp").forward(request, response);
    }
}
