package org.kgc.controller;

import org.kgc.pojo.News;
import org.kgc.service.NewsService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SelectNewsconServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int newsid = Integer.parseInt(request.getParameter("newsid"));
        NewsService service=new NewsService();
        News newsByNewsid = service.getNewsByNewsid(newsid);
        List<News> newsByNewsstate = service.getNewsByNewsstate();
        HttpSession session = request.getSession();
        session.setAttribute("news",newsByNewsid);
        response.sendRedirect("xylq/selectNewscont.jsp");
//        request.setAttribute("news",newsByNewsid);
//        request.getRequestDispatcher("/xylq/selectNewscont.jsp").forward(request,response);
    }
}
