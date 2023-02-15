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

public class ToAddStafinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DeptinfoService deptinfoService = new DeptinfoService();
        List<Deptinfo> deptinfos = deptinfoService.getDeptinfo();
//        PostinfoService postinfoService = new PostinfoService();
//        List<Postinfo> postinfos = postinfoService.getPostinfoBydeptid(deptid);
        request.setAttribute("deptinfos",deptinfos);
//        request.setAttribute("postinfos",postinfos);
        request.getRequestDispatcher("/cgq&yjf/addStafInfo.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
