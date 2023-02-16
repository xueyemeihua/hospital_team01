package org.kgc.controller;


import com.alibaba.fastjson.JSON;
import org.kgc.pojo.*;
import org.kgc.service.CaseService;
import org.kgc.service.impl.CaseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/case/*")
public class CaseController extends BaseServlet {
    private CaseService service = new CaseServiceImpl();
    //查询所有病例信息
    public void selectAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //调用 service 查询
        List<Case> cases= service.selectAll();
        //转为 json
        String jsonString = JSON.toJSONString(cases);
        //写数据
        response.setContentType("text/json;charset=utf-8");
        //响应数据
        response.getWriter().write(jsonString);
    }
    //根据病人编号查询该病人的病例信息
    public void selectByIdCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //医生编号通过登录信息获取
        Stafinfo loginSicker = (Stafinfo) request.getSession().getAttribute("loginSicker");
        int stafid = 0;
        if (loginSicker!=null){
            stafid = loginSicker.getStafid();
        }
        String _sickid = request.getParameter("sickid");
        int sickid = Integer.parseInt(_sickid);
        String _regid = request.getParameter("regid");
        int regid = Integer.parseInt(_regid);
        //调用方法
        List<Case> cases = service.selectByIdCase(stafid,sickid,regid);
        //转为 json
        String jsonString = JSON.toJSONString(cases);
        //写数据
        response.setContentType("text/json;charset=utf-8");
        //响应数据
        response.getWriter().write(jsonString);
    }
    //根据病例编号查询该病人的病例的详细信息
    public void selectByCaseId(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        Integer caseid = JSON.parseObject(params, int.class);

        //调用方法
        Case bingli = service.selectByCaseId(caseid);
        //转为 json
        String jsonString = JSON.toJSONString(bingli);
        //写数据
        response.setContentType("text/json;charset=utf-8");
        //响应数据
        response.getWriter().write(jsonString);
    }
    //根据病例编号查询该病人的病例的详细信息
    public void updateCase(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收数据
        BufferedReader reader = request.getReader();
        String params = reader.readLine();
        Case aCase = JSON.parseObject(params, Case.class);
        String diagnosis = aCase.getDiagnosis();
        Integer caseid = aCase.getCaseid();
        Integer casestate = aCase.getCasestate();
        String curetime = aCase.getCuretime();
        String curescheme = aCase.getCurescheme();
        String regdesc = aCase.getRegdesc();
        Integer regfee = aCase.getRegfee();
        String stafname = aCase.getStafname();

        //调用方法
        CaseInfo caseInfo = service.selectByCaseInfoId(caseid);
        System.out.println(caseInfo);
        //获取数据
        Integer stafid = caseInfo.getStafid();

        //设置参数
        caseInfo.setDiagnosis(diagnosis);
        caseInfo.setCurescheme(curescheme);
        caseInfo.setCuretime(curetime);
        caseInfo.setCasestate(casestate);

        //创建对象并获取数据
        Stafinfo stafinfo = service.selectByStafId(stafid);
        System.out.println(stafinfo);
        Integer rankid = stafinfo.getRankid();

        //设置参数
        stafinfo.setStafname(stafname);

        //创建对象并获取数据
        Rankinfo rankinfo = service.selectByRankId(rankid);
        System.out.println(rankinfo);
        Integer regfeeid = rankinfo.getRegfeeid();

        //创建对象并获取数据
        Regfeestander regfeestander = service.selectByRegfeeStanderId(regfeeid);
        System.out.println(regfeestander);
        regfeestander.setRegfee(regfee);
        regfeestander.setRegdesc(regdesc);

        //调用修改方法
        service.updateCase(caseInfo);
        service.updateRegfee(regfeestander);
        service.updateStaf(stafinfo);

        //响应数据
        response.getWriter().write("success");
    }
    //分页条件查询
    public void selectByPageAndCondition(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收 当前页码 和 每页展示条数    url?currentPage=1&pageSize=5
        String _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);

        // 获取查询条件对象
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //转为 Brand
        Case bingli = JSON.parseObject(params, Case.class);


        //2. 调用service查询
        PageBean<Case> pageBean = service.selectByPageAndCondition(currentPage,pageSize,bingli);

        //2. 转为JSON
        String jsonString = JSON.toJSONString(pageBean);
        //3. 写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }
    //分页条件查询
    public void selectByPageAndStafid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 接收 当前页码 和 每页展示条数    url?currentPage=1&pageSize=5
        String _currentPage = request.getParameter("currentPage");
        String _pageSize = request.getParameter("pageSize");
        String _stafid = request.getParameter("stafid");

        int currentPage = Integer.parseInt(_currentPage);
        int pageSize = Integer.parseInt(_pageSize);

        // 获取查询条件对象
        BufferedReader br = request.getReader();
        String params = br.readLine();//json字符串

        //转为 Brand
        Integer stafid = JSON.parseObject(params, int.class);


        //2. 调用service查询
        PageBean<Case> pageBean = service.selectByPageAndStafid(currentPage,pageSize,stafid);

        //2. 转为JSON
        String jsonString = JSON.toJSONString(pageBean);
        //3. 写数据
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(jsonString);
    }
}
