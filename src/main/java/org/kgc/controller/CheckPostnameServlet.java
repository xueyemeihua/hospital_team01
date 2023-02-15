package org.kgc.controller;

import org.kgc.pojo.Postinfo;
import org.kgc.service.PostinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CheckPostnameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String postname = request.getParameter("postname");
        PostinfoService postinfoService = new PostinfoService();
        List<Postinfo> postinfoByPostname = postinfoService.getPostinfoByPostname(postname);
        if(postinfoByPostname.size()!=0){
            response.getWriter().println(1);
        }else {
            response.getWriter().println(0);
        }
    }
}
