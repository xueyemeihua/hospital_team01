package org.kgc.controller;

import org.kgc.pojo.Stafinfo;
import org.kgc.service.ApplicantidService;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddRecruitServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int applicantid = Integer.parseInt(request.getParameter("applicantid"));
        int postid = Integer.parseInt(request.getParameter("postid"));
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        String stafname = request.getParameter("stafname");
        String stafintro = request.getParameter("stafintro");
        String stafcard = request.getParameter("stafcard");
        String stafphone = request.getParameter("stafphone");
        String email = request.getParameter("email");
        Stafinfo stafinfo = new Stafinfo(null,postid,deptid,stafcard,stafname,99,stafintro,1,stafphone,null,email,"111111");
        StafinfoService stafinfoService = new StafinfoService();
        int i = stafinfoService.addStafInfo(stafinfo);
        System.out.println(i);
        if (i!=0){
            ApplicantidService applicantidService = new ApplicantidService();
            int x = applicantidService.updateApplicantstatus(applicantid);
            System.out.println(x);
            if (x!=0){
                System.out.println("添加成功");
                request.getRequestDispatcher("/recruitManage").forward(request,response);

            }
        }
    }


}
