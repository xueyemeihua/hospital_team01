package org.kgc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.service.PaibanService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class SelectDoctorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        String date = request.getParameter("date");
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        System.out.println(deptid);
        PaibanService paibanService = new PaibanService();
        List<HashMap> doctors = paibanService.selectDoctorByDateAndByDeptid(date, deptid);
        System.out.println(doctors);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(doctors);
        response.getWriter().println(s);
    }
}
