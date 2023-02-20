package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-20-21:04
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.pojo.PresicResult;
import org.kgc.service.PresicResultService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ShowPresicServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int caseid = Integer.parseInt(request.getParameter("caseid"));
        PresicResultService service = new PresicResultService();
        List<PresicResult> presics = service.getPresicByCaseid(caseid);
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(presics);
        response.getWriter().println(s);
    }
}
