package org.kgc.controller;

import org.kgc.pojo.CaseInfo;
import org.kgc.service.CaseinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class ShowAgoCaseinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int stafid = Integer.parseInt(request.getParameter("stafid"));
        CaseinfoService caseinfoService = new CaseinfoService();
        List<HashMap> caseinfos = caseinfoService.getCaseinfoByStafid(stafid);
        HttpSession session = request.getSession();
        session.setAttribute("caseinfos",caseinfos);
        request.getRequestDispatcher("/doctor/showAgoCaseinfo.jsp").forward(request,response);
    }
}
