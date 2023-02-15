package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-10:37
 */

import org.kgc.pojo.Deptinfo;
import org.kgc.pojo.Sickerinfo;
import org.kgc.service.DeptinfoService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ToSickRegServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");

        Sickerinfo loginSicker = (Sickerinfo) request.getSession().getAttribute("loginSicker");
        if (loginSicker!=null){
            DeptinfoService service = new DeptinfoService();
            List<Deptinfo> depts = service.getDeptinfo();

            request.getSession().setAttribute("depts",depts);
            request.getRequestDispatcher("/xylq/sickreg.jsp").forward(request,response);
        } else {
            response.sendRedirect("xylq/sicker_login.html");
        }



    }
}
