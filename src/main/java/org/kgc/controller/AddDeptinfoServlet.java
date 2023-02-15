package org.kgc.controller;

import org.kgc.service.DeptinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddDeptinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String deptname = request.getParameter("deptname");
        DeptinfoService deptinfoService = new DeptinfoService();
        int i = deptinfoService.addDeptinfo(deptname);
        if(i!=0){
            request.getRequestDispatcher("/getDeptinfoAndForward").forward(request,response);
        }
    }
}
