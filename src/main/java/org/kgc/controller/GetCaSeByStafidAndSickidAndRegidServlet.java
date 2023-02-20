package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-20-12:33
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.pojo.CaseInfo;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.CaseinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class GetCaSeByStafidAndSickidAndRegidServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Stafinfo loginUser = (Stafinfo) request.getSession().getAttribute("loginUser");
        int stafid = loginUser.getStafid();
        int sickid = Integer.parseInt(request.getParameter("sickid"));
        int regid = Integer.parseInt(request.getParameter("regid"));
        CaseinfoService service = new CaseinfoService();
        List<CaseInfo> cases = service.getCaSeByStafidAndSickidAndRegid(regid, sickid, stafid);
        System.out.println(cases);
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(cases);
        response.getWriter().println(s);
    }
}
