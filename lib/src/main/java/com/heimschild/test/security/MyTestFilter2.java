package com.heimschild.test.security;

import javax.servlet.*;
import java.io.IOException;

public class MyTestFilter2 implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("Initialising filter 2");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("Filter 2");
    }

    public void destroy() {

    }
}
