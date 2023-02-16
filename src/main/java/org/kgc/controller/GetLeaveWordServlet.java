package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-15-14:55
 */

import org.kgc.pojo.Leaveword;
import org.kgc.service.LeavewordService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetLeaveWordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        LeavewordService service = new LeavewordService();
        List<HashMap> lws = service.getAllLeavewords();
        request.getSession().setAttribute("lws",lws);
        response.sendRedirect("xylq/leaveword.jsp");
    }
}
