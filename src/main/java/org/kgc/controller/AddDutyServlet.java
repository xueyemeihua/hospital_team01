package org.kgc.controller;

import org.kgc.service.PaibanService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

public class AddDutyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int stafid = Integer.parseInt(request.getParameter("stafid"));
        String date = request.getParameter("date");
        System.out.println(date);
        PaibanService paibanService = new PaibanService();
        int i = paibanService.addDuty(stafid, date);
        System.out.println(i);
        if(i!=0){
            System.out.println("值班成功");
        }else {
            System.out.println("值班失败");
        }
        request.getRequestDispatcher("/addScheduling").forward(request,response);

    }
}
