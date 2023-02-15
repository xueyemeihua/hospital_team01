package org.kgc.controller;

import org.kgc.service.ApplicantidService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SelectCaridServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //查询身份证信息,返回查询条数
        //查询条数为0的时候可用
        String carid = request.getParameter("applicantCarid");
        System.out.println("carid  :"+carid);

        ApplicantidService service = new ApplicantidService();

        int i = service.selectCarid(carid);

        System.out.println("查询出"+i+"条数据");
        response.getWriter().println(i);



    }
}
