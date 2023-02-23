package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-14:55
 */

import org.kgc.pojo.CaseNumByDoctor;
import org.kgc.pojo.HotDrug;
import org.kgc.service.DataForShowService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GetDataForShowServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        DataForShowService service = new DataForShowService();
        /*接诊的病例数最多的8个部门*/
        List<CaseNumByDoctor> caseNumByDoctor = service.getCaseNumByDept();
        List<CaseNumByDoctor> mostcasenumbydept = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            CaseNumByDoctor a = caseNumByDoctor.get(i);
            a.setIndex(i);
            mostcasenumbydept.add(a);
        }
        request.getSession().setAttribute("mostcasenumbydept",mostcasenumbydept);


        /*每个科室的医生人数*/
//        List<HashMap> doctorNumByDept = service.getDoctorNumByDept();
//        request.getSession().setAttribute("doctorNumByDept",doctorNumByDept);

        /*热门8大药品*/
        List<HotDrug> hot_Drug = service.getHotDrug();
        List<HotDrug> hotDrug = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            HotDrug hotDrug1 = hot_Drug.get(i);
            hotDrug1.setIndex(i);
            hotDrug.add(hotDrug1);
        }
        System.out.println(hotDrug);
        request.getSession().setAttribute("hotDrug",hotDrug);

//        /*接诊病例最多的8个医生(按部门分组)*/
//        List<MCNDD> most_Case = service.getMostCaseNumForDoctorByDept();
//        System.out.println(most_Case);
//        List<MCNDD> mostCase = new ArrayList<>();
//        for (int i = 0; i < 8; i++) {
//            MCNDD b = most_Case.get(i);
//            System.out.println(b);
//            b.setIndex(i);
//            mostCase.add(b);
//        }
//        request.getSession().setAttribute("mostCase",mostCase);
        response.sendRedirect("cgq&yjf/managerindex.jsp");


    }
}
