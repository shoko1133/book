package chapter18;

import tool.Page;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import java.io.PrintWriter;

@WebServlet(urlPatterns = {"/chapter18/count2"})
public class Count2 extends HttpServlet {

    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);

        Cookie[] cookies = request.getCookies();
        
        //カウンタの値を保持する変数countを用意しnullを代入
        Integer count = null;
        //最初のアクセスの場合クッキーには何も保存されていないのでこのif文は無視され次の33行目のif文へ。２回目以降実行され27行目のifへ。
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                //クッキーのなまえがcountか調べる。取得してIntegerに変換。
                if (cookie.getName().equals("count")) {
                    count = Integer.valueOf(cookie.getValue());
                    break;
                }
            }
        }
        //countの値は0になる。
        if (count == null) {
            count = 0;
        }
        //加算される
        count++;
        
        //カウンタの値をcookieに保存。
        Cookie cookie = new Cookie("count", count.toString());
        cookie.setMaxAge(60 * 60 * 24);
        response.addCookie(cookie);

        out.print(count);
        Page.footer(out);
    }
}
