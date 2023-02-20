package org.kgc.controller;

import org.kgc.service.DrugInfoService;
import org.kgc.service.FacService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;


public class SelectAllDrugInfoServlet extends HttpServlet {
    //private DrugInfoService service = new DrugInfoService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用 DrugInfoService 完成查询
//        List<HashMap> drugInfos = service.selectAll();
//        //存入 request 域中
//        request.setAttribute("drugInfos",drugInfos);




        DrugInfoService service = new DrugInfoService();
        List<HashMap> druginfos = service.selectAll();

        //获取所有的部门信息
        FacService facService = new FacService();
        List<HashMap> facs = facService.getFacs();

        //转发请求域
        request.setAttribute("druginfos",druginfos);
        request.getSession().setAttribute("facs", facs);

        //转发到 drugInfos.jsp 中
        request.getRequestDispatcher("/doctor/drugInfos.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
