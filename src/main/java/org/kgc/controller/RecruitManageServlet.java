package org.kgc.controller;

import org.kgc.service.ApplicantidService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class RecruitManageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ApplicantidService applicantidService = new ApplicantidService();
        List<HashMap> applicants = applicantidService.selectApplicantsBystate();
        HttpSession session = request.getSession();
        session.setAttribute("applicants",applicants);
        request.getRequestDispatcher("/cgq&yjf/applicantManage.jsp").forward(request,response);
    }
}
