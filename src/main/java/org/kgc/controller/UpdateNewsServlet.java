package org.kgc.controller;

import org.kgc.pojo.News;
import org.kgc.service.NewsService;
import org.kgc.utils.DateUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class UpdateNewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int newsid = Integer.parseInt(request.getParameter("newsid"));
        String newstitle = request.getParameter("newstitle");
        String newscont = request.getParameter("newscont");
        int newsstate = Integer.parseInt(request.getParameter("newsstate"));
        String newsdate = DateUtil.NowTime();
        NewsService service=new NewsService();
        News news=new News(newsid,newstitle,newsdate,newscont,newsstate);
        int i = service.updateNews(news);
        if(i==1){
            List<News> newsByNewsstate = service.getNewsByNewsstate();
            HttpSession session = request.getSession();
            session.setAttribute("newss",newsByNewsstate);
            response.sendRedirect("xylq/news.jsp");
        }else {
            response.sendRedirect("xylq/xiaoqiang.jsp");
        }
    }
}
