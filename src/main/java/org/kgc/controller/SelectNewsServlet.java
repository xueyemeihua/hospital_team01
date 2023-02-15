package org.kgc.controller;

import org.kgc.pojo.News;
import org.kgc.service.NewsService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class SelectNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String begin1 = request.getParameter("begin");
        String size1 = request.getParameter("size");
        int begin=0;
        int size=5;
        if(begin1!=""&&begin1!=null&&size1!=""&&size1!=null){
            begin = Integer.parseInt("begin");
            size = Integer.parseInt("size");
        }
        NewsService service=new NewsService();
        List<News> newsByNewsstate = service.getNewsByNewsstate();
        System.out.println(newsByNewsstate);
        HttpSession session = request.getSession();
        session.setAttribute("newss",newsByNewsstate);
        response.sendRedirect("xylq/news.jsp");
    }
}
