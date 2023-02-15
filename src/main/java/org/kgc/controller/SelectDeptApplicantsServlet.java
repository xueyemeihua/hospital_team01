package org.kgc.controller;

import org.kgc.pojo.Applicant;
import org.kgc.service.ApplicantidService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SelectDeptApplicantsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //根据岗位编号查询应聘者
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        int postid = Integer.parseInt(request.getParameter("postid"));
        System.out.println(deptid+postid);

        ApplicantidService service = new ApplicantidService();
        List<Applicant> applicants = service.selectDeptApplicants(postid);

        System.out.println("编号为"+postid+"的应聘者有"+applicants);

        request.getSession().setAttribute("applicants",applicants);
        request.getRequestDispatcher("xylq/selectDeptApplicant.jsp").forward(request,response);

    }
}
