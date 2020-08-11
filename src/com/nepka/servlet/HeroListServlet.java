package com.nepka.servlet;

import com.nepka.bean.Hero;
import com.nepka.dao.HeroDAO;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class HeroListServlet extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int start = 0;
        int count = 5;
        int total = new HeroDAO().getTotal();
        try {
            start = Integer.parseInt(request.getParameter("start"));
        } catch (NumberFormatException e) {
            // 当浏览器没有传参数start时
        }

        int next = start + count;
        int pre = start - count;
        int last;
        if(0==total%count)
            last = total - count;
        else last = total-(total%count);

        pre = Math.max(0, pre);
        next = Math.min(last, total);

        request.setAttribute("next", next);
        request.setAttribute("pre", pre);
        request.setAttribute("last",last);

        List<Hero> heroes = new HeroDAO().list(start, count);
        request.setAttribute("heroes", heroes);
        request.getRequestDispatcher("listHero.jsp").forward(request, response);
    }
}