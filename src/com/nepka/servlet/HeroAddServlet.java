package com.nepka.servlet;

import com.nepka.bean.Hero;
import com.nepka.dao.HeroDAO;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HeroAddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Hero hero = new Hero();
        hero.setName(request.getParameter("name"));
        hero.setHp(Float.parseFloat(request.getParameter("hp")));
        hero.setDamage(Integer.parseInt(request.getParameter("damage")));

        new HeroDAO().add(hero);
        response.sendRedirect("/listHero");
    }
}
