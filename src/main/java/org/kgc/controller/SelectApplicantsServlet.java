package org.kgc.controller;

import org.kgc.pojo.Applicant;
import org.kgc.service.ApplicantidService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SelectApplicantsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询所有应聘人信息
        ApplicantidService service = new ApplicantidService();
        List<Applicant> applicants = service.selectApplicants();

        System.out.println(111);
        System.out.println(applicants);

        request.getSession().setAttribute("applicants",applicants);
        request.getRequestDispatcher("xylq/selectApplicants.jsp").forward(request,response);

    }
}
