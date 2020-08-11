package com.nepka.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    public static final long serialVersionUID = 1L;

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        System.out.println("name:"+name);
        System.out.println("password:"+password);
        if ("admin".equals(name) && "123".equals(password)) {
            request.getSession().setAttribute("userName", name);
            response.sendRedirect("listHero");
        } else {
            response.sendRedirect("login.html");
        }
    }
}
