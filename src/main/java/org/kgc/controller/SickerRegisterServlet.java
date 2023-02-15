package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-14-20:35
 */

import org.kgc.pojo.Sickerinfo;
import org.kgc.service.SickerinfoService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class SickerRegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String sickerUserName = request.getParameter("sickerUserName");
        String sickerpwd1 = request.getParameter("sickerpwd1");
        String sickerpwd2 = request.getParameter("sickerpwd2");

        SickerinfoService service = new SickerinfoService();
        if(sickerpwd1.equals(sickerpwd2)){
            Sickerinfo sickerinfo = new Sickerinfo(null,sickerpwd1,sickerUserName);
            int i = service.insertSicker(sickerinfo);
            if (i == 1) {
                request.getSession().setAttribute("loginSicker",sickerinfo);
                response.sendRedirect("xylq/hospital_main.jsp");
            }
        } else {
            response.sendRedirect("xylq/hospital_main.jsp");
        }


    }
}
