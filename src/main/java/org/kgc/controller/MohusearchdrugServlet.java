package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-11:03
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.service.DrugInfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class MohusearchdrugServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        String drugname = request.getParameter("drugname");
        String drugfunc = request.getParameter("drugfunc");

        DrugInfoService drugInfoService = new DrugInfoService();
        List<HashMap> drugs = drugInfoService.mohuSearchDrug(drugname, drugfunc);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(drugs);
        response.getWriter().println(s);
    }
}
