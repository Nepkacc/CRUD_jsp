package com.nepka.servlet;

import com.nepka.bean.Hero;
        import com.nepka.dao.HeroDAO;

        import javax.servlet.ServletException;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
        import java.io.IOException;


public class HeroEditServlet extends HttpServlet {
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException{

        int id = Integer.parseInt(request.getParameter("id"));
        Hero hero = new HeroDAO().get(id);
        request.setAttribute("hero", hero);
        request.getRequestDispatcher("editHero.jsp").forward(request, response);
    }
}
