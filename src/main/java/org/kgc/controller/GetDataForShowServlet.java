package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-14:55
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.pojo.HotDrug;
import org.kgc.service.DataForShowService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
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
        /*每个医生接诊的病例数*/
        List<HashMap> caseNumByDoctor = service.getCaseNumByDoctor();
        request.getSession().setAttribute("caseNumByDoctor",caseNumByDoctor);
        /*每个科室的医生人数*/
        List<HashMap> doctorNumByDept = service.getDoctorNumByDept();
        request.getSession().setAttribute("doctorNumByDept",doctorNumByDept);
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
        /*接诊病例最多的8个医生(按部门分组)*/
        List<HashMap> most_Case = service.getMostCaseNumForDoctorByDept();
        List<HashMap> mostCase = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            mostCase.add(most_Case.get(i));
        }

        response.sendRedirect("cgq&yjf/managerindex.jsp");


    }
}
