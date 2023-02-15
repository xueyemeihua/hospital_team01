package org.kgc.controller;

import org.kgc.pojo.Stafinfo;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

//显示所有医生，护士信息
public class GetStafinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StafinfoService service = new StafinfoService();
        List<HashMap> stafinfos=service.getStafinfos();
        request.setAttribute("stafinfos",stafinfos);

        request.getRequestDispatcher("/cgq&yjf/getAllDoctor.jsp").forward(request,response);
    }
}
