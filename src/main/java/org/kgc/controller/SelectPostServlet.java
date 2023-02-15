package org.kgc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.pojo.Postinfo;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.PostinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class SelectPostServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        //根据科室编号查询岗位
        PostinfoService service = new PostinfoService();
        List<Postinfo> post = service.getPostinfoBydeptid(deptid);

        System.out.println(post);

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(post);
        response.getWriter().println(s);

    }
}
