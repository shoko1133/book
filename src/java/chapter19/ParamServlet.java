package chapter19;

import java.io.IOException;
import java.io.PrintWriter;
//サーブレットの初期化パラメーターを取得する場合はServletConfigインターフェースをインポートします。
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author shochan
 */
public class ParamServlet extends HttpServlet {
    
    //initメソッドで取得しらパラメーターを保存するためのprivateフィールドです。
    private String message;

    //initメソッドはこのサーブレット起動時に１回だけ実行されます。
    //内部ではgetServletConfigオブジェクトを取得しgetInitParameterメソッドでサーブレットの初期化パラメーターを取得。
    public void init() throws ServletException {
        //messageフィールドに保存。
        ServletConfig config = getServletConfig();
        message = config.getInitParameter("message");
    }
    
    
    public void doGet(
            HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println(message);
        
    }

}
