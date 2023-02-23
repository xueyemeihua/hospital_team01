package org.kgc.controller;

import org.kgc.pojo.Applicant;
import org.kgc.service.ApplicantidService;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

//@WebServlet(name = "SelectSuccessfulApplicationsServlet")
public class SelectSuccessfulApplicationsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查看所有面试通过者
        request.setCharacterEncoding("UTF-8");
        ApplicantidService service = new ApplicantidService();
        List<Applicant> applicants = service.selectSuccessfulApplicants();
        System.out.println(applicants);

        request.getSession().setAttribute("applicants",applicants);

        response.sendRedirect("xylq/article.jsp");
        //request.getRequestDispatcher("xylq/article.jsp").forward(request,response);
    }
}
