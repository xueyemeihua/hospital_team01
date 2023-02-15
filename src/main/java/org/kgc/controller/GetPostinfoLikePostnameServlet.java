package org.kgc.controller;

import org.kgc.pojo.Postinfo;
import org.kgc.service.PostinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class GetPostinfoLikePostnameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String postname = request.getParameter("postname");
        PostinfoService postinfoService =new PostinfoService();
        List<Postinfo> postinfos = postinfoService.getPostinfoLikePostname(postname);
        HttpSession session = request.getSession();
        session.setAttribute("postinfos",postinfos);
        request.getRequestDispatcher("/cgq&yjf/postInfos.jsp").forward(request,response);
    }
}
