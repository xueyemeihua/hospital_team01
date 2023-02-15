package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-11-19:07
 */

import org.kgc.pojo.CaseResult;
import org.kgc.pojo.Sickerinfo;
import org.kgc.service.CaseinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class GetCaseinfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Sickerinfo loginSicker = (Sickerinfo) request.getSession().getAttribute("loginSicker");
        if (loginSicker!=null) {
            int sickid = 0;
            if (loginSicker!=null) {
                sickid = loginSicker.getSickid();
            }
            CaseinfoService service = new CaseinfoService();
            //根据病人id获取病例信息并存入session中
            List<CaseResult> caseResults = service.getCaseinfoBySickid(sickid);
            System.out.println(caseResults);
            request.getSession().setAttribute("caseResults",caseResults);
            response.sendRedirect("xylq/caselist.jsp");
        } else {
            response.sendRedirect("xylq/sicker_login.html");
        }

    }
}
