package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-21-15:49
 */

import org.kgc.pojo.CaseInfo;
import org.kgc.service.CaseinfoService;
import org.kgc.utils.DateUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

public class CureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int caseid = Integer.parseInt(request.getParameter("caseid"));
        String diagnosis = request.getParameter("diagnosis");
        String curescheme = request.getParameter("curescheme");
        String curetime = DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        CaseInfo caseInfo = new CaseInfo(caseid,diagnosis,curescheme,curetime);
        CaseinfoService service = new CaseinfoService();
        int i = service.updateCaseinfo(caseInfo);
        response.getWriter().println(i);

    }
}
