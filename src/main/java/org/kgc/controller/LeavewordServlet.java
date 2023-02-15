package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-10:17
 */

import org.kgc.pojo.Leaveword;
import org.kgc.pojo.Sickerinfo;
import org.kgc.service.LeavewordService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LeavewordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        String _caseid = request.getParameter("caseid");
        int caseid = 0;
        if (_caseid!=null && !_caseid.equals("")){

            caseid = Integer.parseInt(_caseid);
        }
        String lwname = request.getParameter("lwname");
        String lwphone = request.getParameter("lwphone");
        String lwemail = request.getParameter("lwemail");
        String leaveword = request.getParameter("leaveword");
        LeavewordService service = new LeavewordService();
        int i = service.addLeaveWord(new Leaveword(null,lwname,lwphone,lwemail,leaveword,caseid));
        if (i==1) {
            //提示添加成功
            System.out.println("y");
            response.sendRedirect("/getCaseinfo");
        } else {
            //提示添加失败
            System.out.println("n");
            response.sendRedirect("/getCaseinfo");
        }

    }
}
