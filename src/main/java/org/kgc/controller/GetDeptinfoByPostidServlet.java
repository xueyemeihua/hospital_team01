package org.kgc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.pojo.Deptinfo;
import org.kgc.pojo.Postinfo;
import org.kgc.service.DeptinfoService;
import org.kgc.service.PostinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetDeptinfoByPostidServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        int postid = Integer.parseInt(request.getParameter("postid"));
        DeptinfoService deptinfoService = new DeptinfoService();
        List<Deptinfo> deptinfos = deptinfoService.getDeptinfoByPostid(postid);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(deptinfos);
        response.getWriter().println(s);
    }
}
