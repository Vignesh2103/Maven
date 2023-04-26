package com.kgisl.webapp2;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;

@WebFilter(urlPatterns ={"/servlet1","/serv1"})
public class MyFilter implements Filter {

    public void doFilter(ServletRequest req, ServletResponse resp,
            FilterChain chain) throws IOException, ServletException {

        // PrintWriter out = resp.getWriter();
        // out.print("Filter is invoked");

        // chain.doFilter(req, resp);// sends request to next resource

        System.out.println("filter is invoked after");

    }

    public void destroy() {
    }

    public void init(FilterConfig arg0) throws ServletException {
        // TODO Auto-generated method stub

    }

}
