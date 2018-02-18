/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter11;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns={"/chapter11/life-cycle"})
public class LifeCycle extends HttpServlet{
    
    public void init() throws ServletException{
        System.out.print("init");
    }

    public void service(
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException{
        System.out.print("service");
        super.service(request, response);
    
    }
    public void doGet(
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException, IOException{
        System.out.print("doGet");
        
    }
    
    public void destroy(){
    System.out.println("destroy");
    }
}
    