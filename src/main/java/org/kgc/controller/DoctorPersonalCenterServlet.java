package org.kgc.controller;

import org.kgc.pojo.Stafinfo;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;

public class DoctorPersonalCenterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int stafid = Integer.parseInt(request.getParameter("stafid"));
        StafinfoService stafinfoService = new StafinfoService();
        HashMap stafinfo = stafinfoService.getAllByStafid(stafid);
        HttpSession session = request.getSession();
        session.setAttribute("stafinfo",stafinfo);
        request.getRequestDispatcher("/doctor/personalCenter.jsp").forward(request,response);

    }
}
