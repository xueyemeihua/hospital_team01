package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-10:55
 */


import org.kgc.pojo.Sickerinfo;
import org.kgc.service.SickerinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SickerLoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //获取用户输入参数,转型(如需要),调用查询方法看看数据库是否存在该用户,1则跳转,0则提示注册

        String uname = null;
        String email = null;
        String phone = null;
        String card = null;
        //int flag = 0;
        String sickerLoginName = request.getParameter("sickerLoginName");
        //判断用户使用哪种方式登录
        if (sickerLoginName.indexOf("@") != -1) {
            email = sickerLoginName;
            System.out.println(email);
        } else if (sickerLoginName.length() == 11) {
            phone = sickerLoginName;
        } else if (sickerLoginName.length() == 18) {
            card = sickerLoginName;
        } else {
            uname = sickerLoginName;
        }
        //将以上四种方式和密码封装成pojo传递给mapper
        String password = request.getParameter("sickerLoginPassword");
        //病人登录
        Sickerinfo sickerinfo = new Sickerinfo(card, phone, password, uname, email);
        SickerinfoService service = new SickerinfoService();
        Sickerinfo loginUser = service.getSickerBySickUnameOrSickPhoneOrCardIdOrSickEmailAndPassword(sickerinfo);
        if (loginUser != null) {
            request.getSession().setAttribute("loginSicker", loginUser);
            //返回1,则用户登录过
            response.getWriter().println(1);
            response.sendRedirect("xylq/hospital_main.jsp");
        } else {
            //返回0,没有登录信息
            response.getWriter().println(0);
            response.sendRedirect("xylq/sicker_login.html");
        }
    }
}
