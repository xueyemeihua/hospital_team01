package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-20-19:43
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.service.DrugInfoService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetDrugsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int caseid = Integer.parseInt(request.getParameter("caseid"));

        //查询所有药品
        DrugInfoService service = new DrugInfoService();
        List<HashMap> drugs = service.selectAll();

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(drugs);
        response.getWriter().println(s);

    }
}