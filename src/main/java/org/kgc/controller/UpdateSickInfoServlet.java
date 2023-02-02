package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-17:37
 */

import org.kgc.pojo.Sickerinfo;
import org.kgc.service.SickerinfoService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class UpdateSickInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        /*
        获取用户输入的修改参数，调用方法修改
         */
        Sickerinfo loginSicker = (Sickerinfo) request.getSession().getAttribute("loginSicker");
        String sickphone = request.getParameter("sickphone");
        String sickuname = request.getParameter("sickuname");
        String sickemail = request.getParameter("sickemail");
        String sickpwd = request.getParameter("pwd");
        int sickid = loginSicker.getSickid();
        Sickerinfo sickerinfo = new Sickerinfo(sickphone, sickpwd, sickuname, sickemail, sickid);
        SickerinfoService service = new SickerinfoService();
        int result = service.updateSickerInfo(sickerinfo);
        if (result == 1) {
            //更新成功，刷新存储的session信息,跳转到登录页面
            request.getSession().setAttribute("loginSicker", null);
            response.sendRedirect("/xylq/sickerLogin.jsp");
        } else {
            //修改失败，提示修改失败，留在当前页面
            request.setAttribute("updateMsg","修改失败请重新操作或者返回");
            request.getRequestDispatcher("/xylq/sickerLogin.jsp").forward(request,response);
        }
    }
}
