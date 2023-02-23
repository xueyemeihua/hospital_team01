package org.kgc.controller;

import org.kgc.service.CaseinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetCaseinfoByServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String sickname = request.getParameter("sickname");
        String diagnosis = request.getParameter("diagnosis");
        String curescheme = request.getParameter("curescheme");
        CaseinfoService caseinfoService = new CaseinfoService();
        List<HashMap> caseinfo = caseinfoService.getCaseinfoBy(sickname, diagnosis, curescheme);
        HttpSession session = request.getSession();
        session.setAttribute("caseinfo",caseinfo);
        request.getRequestDispatcher("/doctor/showAgoCaseinfo.jsp").forward(request,response);
    }
}
