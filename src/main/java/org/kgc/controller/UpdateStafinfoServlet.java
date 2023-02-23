package org.kgc.controller;

import org.kgc.pojo.Stafinfo;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateStafinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String stafphone = request.getParameter("stafphone");
        String stafintro = request.getParameter("stafintro");
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String username = request.getParameter("username");
        int stafid = Integer.parseInt(request.getParameter("stafid"));
        Stafinfo stafinfo = new Stafinfo(stafid,stafintro,stafphone,username,email,password);
        StafinfoService stafinfoService = new StafinfoService();
        int i = stafinfoService.updateStafinfo(stafinfo);
        System.out.println(stafinfo);
        if(i!=0){
            System.out.println("修改成功");
            request.getRequestDispatcher("/doctorPersonalCenter").forward(request,response);
        }


    }
}
