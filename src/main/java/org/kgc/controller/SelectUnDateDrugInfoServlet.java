package org.kgc.controller;

import org.kgc.pojo.DrugInfo;
import org.kgc.service.DrugInfoService;
import org.kgc.utils.DateUtil;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

public class SelectUnDateDrugInfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Date date = new Date();
        String format = DateUtil.format(date, "yyyy-MM-dd HH:mm:ss");
        DrugInfoService service = new DrugInfoService();
        List<DrugInfo> drugInfos = service.getDate(format);

        HttpSession session = request.getSession();
        session.setAttribute("druginfos",drugInfos);

        request.getRequestDispatcher("/doctor/drugInfos.jsp").forward(request,response);
    }
}
