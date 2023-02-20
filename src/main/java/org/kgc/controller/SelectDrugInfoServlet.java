package org.kgc.controller;

import org.kgc.pojo.DrugInfo;
import org.kgc.service.DrugInfoService;
import org.kgc.service.FacService;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class SelectDrugInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String drugname = request.getParameter("drugname");
        DrugInfoService service = new DrugInfoService();
        List<DrugInfo> drugInfos = service.selectDrugInfo(drugname);

        HttpSession session = request.getSession();
        session.setAttribute("druginfos",drugInfos);

        request.getRequestDispatcher("/doctor/drugInfos.jsp").forward(request,response);
    }
}
