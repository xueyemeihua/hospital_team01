package org.kgc.controller;

import org.kgc.pojo.Deptinfo;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.DeptinfoService;
import org.kgc.service.PaibanService;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class AddSchedulingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String date = request.getParameter("date");
        HttpSession session = request.getSession();
        session.setAttribute("date",date);

        DeptinfoService deptinfoService = new DeptinfoService();
        List<Deptinfo> deptinfos = deptinfoService.getDeptinfo();
        session.setAttribute("deptinfos",deptinfos);

        PaibanService paibanService =new PaibanService();
        List<HashMap> stafinfos = paibanService.getPaibanStafByDate(date);
        session.setAttribute("stafinfos",stafinfos);

        List ids = new ArrayList();
        for (HashMap stafinfo : stafinfos) {
            stafinfo.forEach((k,v)->{
                if (k.equals("stafid")){
                    ids.add(v);
                }
            });
        }
        List<Stafinfo> stafs;
        StafinfoService stafinfoService = new StafinfoService();
        if(ids.size()!=0){
             stafs= stafinfoService.getStafinfoByNotIn(ids);
        }else {
             stafs = stafinfoService.getAllStafinfos();
        }


        session.setAttribute("stafs",stafs);

        request.getRequestDispatcher("cgq&yjf/addScheduling.jsp").forward(request,response);

    }
}
