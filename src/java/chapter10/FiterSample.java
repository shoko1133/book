/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
/**
 *
 * @author shochan
 */
@WebServlet(urlPatterns={"/chapter10/filter-sample"})
public class FiterSample extends HttpServlet {
    public void doGet (
        HttpServletRequest request, HttpServletResponse response
    ) throws ServletException ,IOException {
        PrintWriter out = response.getWriter();
        out.println("だいすきだ");
    }
}