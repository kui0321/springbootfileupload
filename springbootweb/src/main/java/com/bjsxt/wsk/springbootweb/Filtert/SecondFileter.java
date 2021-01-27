package com.bjsxt.wsk.springbootweb.Filtert;

import javax.servlet.*;
import java.io.IOException;

public class SecondFileter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入SecondFileter.doFilter");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("出SecondFileter.doFilter");
    }

    @Override
    public void destroy() {

    }
}
