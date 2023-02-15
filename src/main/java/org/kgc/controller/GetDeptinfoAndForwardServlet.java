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

public class GetDeptinfoAndForwardServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        DeptinfoService deptinfoService = new DeptinfoService();
        List<Deptinfo> deptinfos = deptinfoService.getDeptinfo();
        HttpSession session = request.getSession();
        session.setAttribute("deptinfos",deptinfos);
//        request.getRequestDispatcher("/cgq&yjf/deptInfos.jsp").forward(request,response);
        response.sendRedirect("cgq&yjf/deptInfos.jsp");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
