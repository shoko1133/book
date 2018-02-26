/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ParamFilter implements Filter {

    private String message;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        message = filterConfig.getInitParameter("message");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain
    ) throws IOException, ServletException {
        PrintWriter out = response.getWriter();
        out.println(message);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}
