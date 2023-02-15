package org.kgc.controller;

import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FiredStafinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int stafid = Integer.parseInt(request.getParameter("stafid"));
        StafinfoService stafinfoService = new StafinfoService();
        int i = stafinfoService.firedStafinfo(stafid);
        if(1!=0){
            request.getRequestDispatcher("/getStafinfo").forward(request,response);
        }
    }
}
