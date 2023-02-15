package org.kgc.controller;

import org.kgc.pojo.News;
import org.kgc.service.NewsService;
import org.kgc.utils.DateUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

public class AddNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String newstitle = request.getParameter("newstitle");
        String newscont = request.getParameter("newscont");

        String newsdate = DateUtil.NowTime();
        if(newstitle!=null&&newstitle!=""&&newscont!=null&&newscont!="") {
            News news = new News(newstitle, newsdate, newscont);
            NewsService service = new NewsService();
            int i = service.addNews(news);
            System.out.println(i);
            if (i==1) {
                List<News> newsByNewsstate = service.getNewsByNewsstate();
                HttpSession session = request.getSession();
                session.setAttribute("newss", newsByNewsstate);
                System.out.println("我进来了");
                response.sendRedirect("xylq/news.jsp");
            } else {
                System.out.println("我没进来");
                response.sendRedirect("xylq/add.jsp");
            }
        }else {
            System.out.println("我早出去了");
            response.sendRedirect("xylq/add.jsp");
        }
    }
}
