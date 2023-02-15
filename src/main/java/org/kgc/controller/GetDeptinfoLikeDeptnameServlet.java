package org.kgc.controller;

import org.kgc.pojo.Deptinfo;
import org.kgc.service.DeptinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class GetDeptinfoLikeDeptnameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String deptname = request.getParameter("deptname");
        DeptinfoService deptinfoService = new DeptinfoService();
        List<Deptinfo> deptinfoByDeptname = deptinfoService.getDeptinfoLikeDeptname(deptname);
        HttpSession session = request.getSession();
        session.setAttribute("deptinfos",deptinfoByDeptname);
        request.getRequestDispatcher("/cgq&yjf/deptInfos.jsp").forward(request,response);
    }
}
