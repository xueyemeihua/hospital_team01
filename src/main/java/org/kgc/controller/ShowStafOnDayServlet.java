package org.kgc.controller;

import org.kgc.pojo.Paiban;
import org.kgc.service.PaibanService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

public class ShowStafOnDayServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String date = request.getParameter("date");
        PaibanService paibanService = new PaibanService();
        List<Paiban> paibans = paibanService.getPaibanByDate(date);
        HttpSession session = request.getSession();
        session.setAttribute("paibans",paibans);

    }
}
