package org.kgc.controller;

import org.apache.ibatis.binding.MapperMethod;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class GetStafinfoByDeptidServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        StafinfoService stafinfoService = new StafinfoService();
        List<Stafinfo> stafinfoss = stafinfoService.getStafinfoByDeptid(deptid);
        HttpSession session = request.getSession();
        session.setAttribute("stafinfossa",stafinfoss);

    }

}
