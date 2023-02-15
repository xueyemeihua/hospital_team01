package org.kgc.controller;

import org.kgc.pojo.Deptinfo;
import org.kgc.service.DeptinfoService;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetDeptInfoServletForwardStafentryServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询科室
        DeptinfoService service1 = new DeptinfoService();
        List<Deptinfo> depts = service1.getDeptinfo();
        request.getSession().setAttribute("deptinfos",depts);
        request.getRequestDispatcher("cgq&yjf/stafentry.jsp").forward(request,response);
    }
}
