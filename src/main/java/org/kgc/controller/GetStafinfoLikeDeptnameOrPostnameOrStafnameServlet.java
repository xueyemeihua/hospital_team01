package org.kgc.controller;

import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetStafinfoLikeDeptnameOrPostnameOrStafnameServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String deptname = request.getParameter("deptname");
        String postname = request.getParameter("postname");
        String stafname = request.getParameter("stafname");
        int stafstate = Integer.parseInt(request.getParameter("stafstate"));
        StafinfoService stafinfoService = new StafinfoService();
        List<HashMap> stafinfoLikeDeptnameOrPostnameOrStafname = stafinfoService.getStafinfoLikeDeptnameOrPostnameOrStafname(deptname, postname, stafname,stafstate);
        HttpSession session = request.getSession();
        session.setAttribute("stafinfos",stafinfoLikeDeptnameOrPostnameOrStafname);
        request.getRequestDispatcher("/cgq&yjf/getAllDoctor.jsp").forward(request,response);

    }
}
