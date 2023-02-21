package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-20-23:12
 */

import org.kgc.pojo.Prescinfo;
import org.kgc.service.PrescinfoService;
import org.kgc.utils.DateUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.Date;

public class AddDrugToPrescServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        int drugid = Integer.parseInt(request.getParameter("drugid"));
        int caseid = Integer.parseInt(request.getParameter("caseid"));
        int dcout = Integer.parseInt(request.getParameter("dcout"));
        String date = DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss");
        Prescinfo pre = new Prescinfo(0,drugid,caseid,dcout,0,date);
        PrescinfoService service = new PrescinfoService();
        int i = service.insertPresc(pre);
        response.getWriter().println(i);
    }
}
