package com.nepka.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse)servletResponse;

        String uri = request.getRequestURI();
        if (uri.endsWith("login.html") || uri.endsWith("login")) {
            filterChain.doFilter(request, response);
            return;
        }

        String userName = (String) request.getSession().getAttribute("userName");
        if (null == userName) {
            response.sendRedirect("login.html");
            return;
        }

        filterChain.doFilter(request, response);

    }

    @Override
    public void destroy() {

    }
}
