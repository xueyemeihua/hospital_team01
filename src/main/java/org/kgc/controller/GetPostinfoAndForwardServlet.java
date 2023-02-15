package org.kgc.controller;

import org.kgc.pojo.Deptinfo;
import org.kgc.pojo.Postinfo;
import org.kgc.service.DeptinfoService;
import org.kgc.service.PostinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class GetPostinfoAndForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PostinfoService postinfoService = new PostinfoService();
        List<Postinfo> postinfos = postinfoService.getPostinfo();
        HttpSession session = request.getSession();
        session.setAttribute("postinfos",postinfos);
        DeptinfoService deptinfoService = new DeptinfoService();
        List<Deptinfo> deptinfos = deptinfoService.getDeptinfo();
        HttpSession session1 = request.getSession();
        session1.setAttribute("deptinfos",deptinfos);
        response.sendRedirect("cgq&yjf/postInfos.jsp");


    }
}
