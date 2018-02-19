package bean;

//import bean.Product;
import tool.Page;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = {"/bean/Bean"})
public class Bean extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        //Productクラスのオブジェクトを生成。
        Product p = new Product();

        p.setId(1);
        p.setName("まぐろ");
        p.setPrice(100);

        out.println(p.getId());
        out.println(":");
        out.println(p.getName());
        out.println(":");
        out.println(p.getPrice());

        Page.footer(out);
    }
}
