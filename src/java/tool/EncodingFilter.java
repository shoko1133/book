/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tool;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//Webフィルターアノテーション。URLパターンを/*にすることによってこのフィルタを作成する
//全てのサーブレットとJSPファイルに適用します。
@WebFilter(urlPatterns={"*"})

//フィルタのクラスではFilterインターフェースを実装して3つのメソッドをオーバーライドしています。
public class EncodingFilter implements Filter {
    
    public void doFilter (
        ServletRequest request, ServletResponse response,
        FilterChain chain
    ) throws IOException, ServletException {
        //リクエストの文字のエンコーディング
        request.setCharacterEncoding("UTF-8");
        //レスポンスのMIMEタイプと文字エンコーディング
        response.setContentType("text/html; charset=UTF-8");
        
        PrintWriter out = response.getWriter();
        //out.println("しょうちゃん");
    
        //Fiterhainインターフェースのdofilterメソッドを実行しています。
        chain.doFilter(request, response);
        //out.println("にゃー");
    }
    public void init(FilterConfig filterConfig){}
    public void destroy(){}
}