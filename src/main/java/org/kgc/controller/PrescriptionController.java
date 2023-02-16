package org.kgc.controller;

import com.alibaba.fastjson.JSON;
import org.kgc.pojo.DrugInfo;
import org.kgc.pojo.PrescInfo;
import org.kgc.pojo.Prescription;
import org.kgc.service.PrescriptionService;
import org.kgc.service.impl.PrescriptionServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/prescription/*")
public class PrescriptionController {
    private PrescriptionService service = new PrescriptionServiceImpl();
    //根据处方单编号查询病例信息
    public void selectById(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String _prescid = request.getParameter("prescid");
        int prescid = Integer.parseInt(_prescid);
        //调用方法
        Prescription prescription = service.selectByIdPresc(prescid);
        //转为 json
        String jsonString = JSON.toJSONString(prescription);
        //写数据
        response.setContentType("text/json;charset=utf-8");
        //响应数据
        response.getWriter().write(jsonString);
    }
    //添加病例数据
    public void addPresc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //接收数据
        String drugname = request.getParameter("drugname");
        String _drugprice = request.getParameter("drugprice");
        String _drugcount = request.getParameter("drugcount");
        String _prescstate = request.getParameter("prescstate");
        //转换类型
        int drugcount = Integer.parseInt(_drugcount);
        int prescstate = Integer.parseInt(_prescstate);
        int drugprice = Integer.parseInt(_drugprice);
        //创建对象 Prescription 对象
        Prescription prescription = new Prescription();
        //设置参数
        prescription.setDrugname(drugname);
        //根据药品名称查询药品信息
        DrugInfo drugInfo = service.selectByNameDrug(drugname);
        //获取药品编号
        Integer drugid = drugInfo.getDrugid();
        drugInfo.setDrugprice(drugprice);
        //创建一个 PrescInfo 对象
        PrescInfo prescInfo = new PrescInfo();
        //设置参数
        prescInfo.setDrugid(drugid);
        prescInfo.setDrugcount(drugcount);
        prescInfo.setPrescstate(prescstate);
        //调用添加方法

        //响应数据
        response.getWriter().write("success");
    }

    //根据病人的病例编号查看病人的处方信息
    public void getPrescByCaseid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String _caseid = request.getParameter("caseid");
        int caseid = Integer.parseInt(_caseid);
        List<Prescription> prescription = service.getPrescByCaseid(caseid);

        //转为 json
        String jsonString = JSON.toJSONString(prescription);
        //写数据
        response.setContentType("text/json;charset=utf-8");
        //响应数据
        response.getWriter().write(jsonString);

    }



    //根据处方单编号查询病例信息
    public void selectByIdBingli(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String _caseid = request.getParameter("caseid");
        int caseid = Integer.parseInt(_caseid);
        //调用方法
        Prescription prescription = service.selectByIdBingli(caseid);
        //转为 json
        String jsonString = JSON.toJSONString(prescription);
        //写数据
        response.setContentType("text/json;charset=utf-8");
        //响应数据
        response.getWriter().write(jsonString);
    }
}
