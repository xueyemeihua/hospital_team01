package org.kgc.controller;

import org.kgc.pojo.DrugInfo;
import org.kgc.service.DrugInfoService;

import javax.servlet.*;

import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class AddDrugInfoServlet extends HttpServlet {
    private DrugInfoService service = new DrugInfoService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //处理POST请求的中文乱码问题
        request.setCharacterEncoding("UTF-8");

//        接收表单提交的数据，封装为一个 DrugInfo 对象
        String drugname = request.getParameter("drugname");
        String druginven = request.getParameter("druginven");
        String drugprice = request.getParameter("drugprice");
        String drugindate = request.getParameter("drugindate");
        String drugprodate = request.getParameter("drugprodate");
        int drugfac = Integer.parseInt(request.getParameter("drugfac"));
        String facphone = request.getParameter("facphone");
        String drugfunc = request.getParameter("drugfunc");
        String drugspeci = request.getParameter("drugspeci");
        //封装为一个 DrugInfo 对象
        DrugInfo drugInfo = new DrugInfo();
        drugInfo.setDrugname(drugname);
        drugInfo.setDruginven(Integer.parseInt(druginven));
        drugInfo.setDrugprice(Double.parseDouble(drugprice));
        drugInfo.setDrugindate(drugindate);
        drugInfo.setDrugprodate(drugprodate);
        drugInfo.setDrugfac(drugfac);
        drugInfo.setFacphone(facphone);
        drugInfo.setDrugfunc(drugfunc);
        drugInfo.setDrugspeci(drugspeci);
        //调用service 完成添加
        service.add(drugInfo);


        //转发到查询所有 Servlet
        request.getRequestDispatcher("/selectAllDrugInfoServlet").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
}
