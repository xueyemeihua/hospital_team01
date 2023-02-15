package org.kgc.controller;

import org.kgc.service.DeptinfoService;
import org.kgc.service.PostinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddPostinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String postname = request.getParameter("postname");
        System.out.println(postname);
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        System.out.println(deptid);
        PostinfoService postinfoService = new PostinfoService();
        int i = postinfoService.addPostinfo(postname,deptid);
        System.out.println(i);
        if(i!=0){
            request.getRequestDispatcher("/getPostinfoAndForward").forward(request,response);
        }
    }
}
