package org.kgc.controller;

import org.kgc.pojo.CaseResult;
import org.kgc.service.CaseinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ToSickViewServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int sickid = Integer.parseInt(request.getParameter("sickid"));
        CaseinfoService caseinfoService = new CaseinfoService();
        List<CaseResult> caseResults = caseinfoService.getCaseinfoBySickid(sickid);
        HttpSession session = request.getSession();
        session.setAttribute("caseResults",caseResults);
        response.sendRedirect("xylq/caselist.jsp");
    }
}
