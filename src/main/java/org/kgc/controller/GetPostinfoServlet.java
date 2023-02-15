package org.kgc.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.pojo.Postinfo;
import org.kgc.service.PostinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetPostinfoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        int deptid = Integer.parseInt(request.getParameter("deptid"));
        PostinfoService postinfoService = new PostinfoService();
        List<Postinfo> postinfos = postinfoService.getPostinfoBydeptid(deptid);
        System.out.println("岗位"+postinfos);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(postinfos);
        response.getWriter().println(s);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
