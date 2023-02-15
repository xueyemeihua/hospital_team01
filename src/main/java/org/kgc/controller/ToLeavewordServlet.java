package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-12-19:27
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ToLeavewordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int caseid = Integer.parseInt(request.getParameter("caseid"));
        System.out.println(caseid);
        request.getSession().setAttribute("caseid",caseid);
        response.sendRedirect("xylq/leaveword.jsp");
    }
}
