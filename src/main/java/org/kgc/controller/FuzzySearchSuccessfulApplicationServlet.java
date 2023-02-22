package org.kgc.controller;

import org.kgc.pojo.Applicant;
import org.kgc.service.ApplicantidService;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class FuzzySearchSuccessfulApplicationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //模糊查询
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("applicantName");
        String email = request.getParameter("email");


        ApplicantidService service = new ApplicantidService();
        List<Applicant> applicants = service.FuzzySearchSuccessfulApplicationServlet(name, email);

        request.getSession().setAttribute("applicants",applicants);

        response.sendRedirect("xylq/article.jsp");
    }
}
