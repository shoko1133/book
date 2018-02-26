package chapter17;

import tool.Page;
import dao.ProductDAO;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(urlPatterns = {"/chapter17/count"})
public class Count extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        //getSessionメソッドを使ってオブジェクトを取得。
        HttpSession session = request.getSession();
        //セッション属性からカウンタの値を取得するが、getAttributeメソッドの戻り値はobject型なのでintegerに変換。
        Integer count = (Integer) session.getAttribute("count");
        //変数がnullの場合は最初のアクセスなのでnullの場合は0を代入。
        if (count == null) 
            count = 0;
        
        count++;
        //カウンタの値を+1したあとsetAttributeメソッドで再びセッション属性に保存しています。
        session.setAttribute("count", count);

        out.println("<p>" + count + "</p>");
        //getIdメソッドをつかってセッションIdを取得する。
        out.println("<p>" + session.getId() + "</p>");
        Page.footer(out);

    }

}
