package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-10:36
 */

import org.kgc.pojo.Reginfo;
import org.kgc.pojo.Sickerinfo;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.RankinfoService;
import org.kgc.service.ReginfoService;
import org.kgc.service.SickerinfoService;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.HashMap;

public class SickRegServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String sickname = request.getParameter("sickname");
        String sickcard = request.getParameter("sickcard");
        String sickphone = request.getParameter("sickphone");
        String sickemail = request.getParameter("sickemail");
        String sickpwd = request.getParameter("sickpwd");
        String sickpwd1 = request.getParameter("sickpwd1");
        Integer deptid = Integer.parseInt(request.getParameter("deptid"));
        Integer stafid = Integer.parseInt(request.getParameter("stafid"));
        //将病人信息封装进对象在数据库中存入,并获取新增主键,然后在挂号表中新增该病人的挂号信息(需要查挂号等级表找寻挂号费等级)
        if (sickpwd.equals(sickpwd1)) {
            Sickerinfo sickerinfo = new Sickerinfo(null, sickcard, sickname, sickphone, sickpwd, sickemail);
            SickerinfoService sickerinfoService = new SickerinfoService();
            int i = sickerinfoService.addSickerInfo(sickerinfo);
            if (i == 1) {
                //病人信息添加成功,根据病人选择的医生查询这个医生的个人信息
                StafinfoService stafinfoService = new StafinfoService();
                Stafinfo stafinfo = stafinfoService.getStafinfoByStafid(stafid);
                //获取该医生的职称编号
                Integer rankid = stafinfo.getRankid();
                //根据职称编号查询挂号费
                RankinfoService rankinfoService = new RankinfoService();
                HashMap regfee_id = rankinfoService.getRegfeeidByRankid(rankid);
                //挂号费编号默认为1,即0元
                //挂号信息的修改涉及到两张表,所以添加挂号信息需要将其是为一个事务
                Integer regfeeid = 1;
                if (regfee_id!=null){
                    regfeeid = (Integer) regfee_id.get("regfeeid");
                }
                Reginfo reginfo = new Reginfo(null, deptid, new Timestamp(System.currentTimeMillis()), regfeeid, sickerinfo.getSickid(),stafid, 1);
                ReginfoService reginfoService = new ReginfoService();
                int result = reginfoService.addReginfo(reginfo);
                response.sendRedirect("xylq/hospital_main.jsp");
            } else {
                response.sendRedirect("xylq/hospital_main.jsp");
            }
        }
    }
}

