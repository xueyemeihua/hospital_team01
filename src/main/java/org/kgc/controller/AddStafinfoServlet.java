package org.kgc.controller;

import org.kgc.pojo.Stafinfo;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStafinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int postid = Integer.parseInt(request.getParameter("postid"));
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        String stafcard = request.getParameter("stafcard");
        String stafname = request.getParameter("stafname");
        String stafintro="";
        int stafstate = 1;
        int rankid =99;
        String stafphone = request.getParameter("stafphone");
        String username = request.getParameter("username");
        String email = request.getParameter("email");
        String password1 = request.getParameter("password1");
        String password2 = request.getParameter("password2");
        if(password1.equals(password2)){
            Stafinfo stafinfo = new Stafinfo(postid,deptid,stafcard,stafname,rankid,stafintro,stafstate,stafphone,username,email,password1);
            StafinfoService stafinfoService = new StafinfoService();
            int i = stafinfoService.addStafInfo(stafinfo);
            System.out.println(i);
            if(i!=0){
                System.out.println("跳转");
                request.getRequestDispatcher("/cgq&yjf/stafLogin.jsp").forward(request,response);
            }else {

                System.out.println("添加用户失败");
            }
        }else{
            System.out.println("两次输入的密码不一致");
        }



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
