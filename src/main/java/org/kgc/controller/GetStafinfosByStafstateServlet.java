package org.kgc.controller;

import org.kgc.service.StafinfoService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetStafinfosByStafstateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StafinfoService service=new StafinfoService();
        List<HashMap> stafinfosByStafstate = service.getStafinfosByStafstate();
        request.setAttribute("getStafinfosByStafstate",stafinfosByStafstate);
        request.getRequestDispatcher("/cgq&yjf/getAllDoctorByStafstate.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
