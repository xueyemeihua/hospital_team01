package org.kgc.controller;

import org.kgc.pojo.Applicant;
import org.kgc.service.ApplicantidService;
import org.kgc.service.PostinfoService;
import org.kgc.utils.CalculateAge;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddApplicantidServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String carid = request.getParameter("carid");
        String phone = request.getParameter("phone");
        String myEmail = request.getParameter("myEmail");
        String sex = request.getParameter("sex");
        //String deptname = request.getParameter("deptname");
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        int salary = (Integer.parseInt(request.getParameter("salary")));
        String myself = request.getParameter("myself");
        String agowork = request.getParameter("agowork");
        int postid = Integer.parseInt(request.getParameter("postid"));

        //调用计算年龄方法,并将年龄存入
        CalculateAge calculateAge = new CalculateAge();
        int age = calculateAge.getPersonAgeFromIdCard(carid);

        Applicant applicant = new Applicant();
        applicant.setApplicantName(name);
        applicant.setApplicantSex(sex);
        applicant.setApplicantCarid(carid);
        applicant.setApplicantPhone(phone);
        applicant.setEmail(myEmail);
        applicant.setSalary(salary);
        applicant.setMyself(myself);
        applicant.setAgowork(agowork);
        applicant.setApplicantAge(age);
        applicant.setApplicantstatus(0);
        applicant.setDeptid(deptid);
        applicant.setPostid(postid);




        System.out.println(applicant);
        System.out.println("上面是对象");

        ApplicantidService service = new ApplicantidService();

        int i = service.insertApplicantid(applicant);



        if (i == 1){
            System.out.println("添加成功");

            request.getSession().setAttribute("applicant",applicant);
            request.getRequestDispatcher("xylq/alert.jsp").forward(request,response);
        }else{
            request.setAttribute("applicant","申请失败");
            request.getRequestDispatcher("/xylq/stafentry.jsp").forward(request,response);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
