package org.kgc.controller;


import com.alibaba.fastjson.JSON;
import org.kgc.pojo.PageBean;
import org.kgc.pojo.Patient;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.PatientService;
import org.kgc.service.impl.PatientServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/patient/*")
public class PatientController extends BaseServlet {
    private PatientService service = new PatientServiceImpl();
    //查询所有病人信息
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用查询所有方法
        List<Patient> patients = service.selectAll();
        //转为 json
        String jsonString = JSON.toJSONString(patients);
        //写数据
        response.setContentType("text/json;charset=utf-8");
        //响应数据
        response.getWriter().write(jsonString);
    }
    //分页查询
    public void selectByPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收 当前页码 和 每页展示条数    url?currentPage=1&pageSize=5
        String _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);

        //2. 调用service查询
        PageBean<Patient> pageBean = service.selectByPage(currentPage, pageSize);

        //2. 转为JSON
        String jsonString = JSON.toJSONString(pageBean);
        //3. 写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }
    //分页条件查询
    public void selectByPageAndCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收 当前页码 和 每页展示条数    url?currentPage=1&pageSize=5
        String _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);
        Stafinfo loginSicker = (Stafinfo) request.getSession().getAttribute("loginSicker");
        Integer stafid = loginSicker.getStafid();
        // 获取查询条件对象
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //转为 Patient
        Patient patient = JSON.parseObject(params, Patient.class);


        //2. 调用service查询
        PageBean<Patient> pageBean = service.selectByPageAndCondition(stafid,currentPage,pageSize,patient);

        //2. 转为JSON
        String jsonString = JSON.toJSONString(pageBean);
        //3. 写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }
}
