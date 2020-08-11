package com.nepka.servlet;

import com.nepka.bean.Hero;
import com.nepka.dao.HeroDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeroUpdateServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException{
        Hero hero = new Hero();
        hero.setId(Integer.parseInt(request.getParameter("id")));
        hero.setName(request.getParameter("name"));
        hero.setHp(Float.parseFloat(request.getParameter("hp")));
        hero.setDamage(Integer.parseInt(request.getParameter("damage")));
        new HeroDAO().update(hero);

        //request.setAttribute("hero", hero);
        //request.getRequestDispatcher("/listHero").forward(request, response);
        response.sendRedirect("/listHero");
    }
}
