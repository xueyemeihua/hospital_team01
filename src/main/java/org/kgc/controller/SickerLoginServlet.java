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

        String sickerUname = null;
        String sickerEmail = null;
        String sickerPhone = null;
        String sickerCardid = null;
        String sickerLoginName = request.getParameter("sickerLoginName");
        //判断用户使用哪种方式登录
        if (sickerLoginName.indexOf("@")!=-1){
            sickerEmail = sickerLoginName;
        }else if (sickerLoginName.length()==11){
            sickerPhone = sickerLoginName;
        }else if (sickerLoginName.length()==18) {
            sickerCardid = sickerLoginName;
        } else {
            sickerUname = sickerLoginName;
        }
        //将以上四种方式和密码封装成pojo传递给mapper
        String sickerLoginPassword = request.getParameter("sickerLoginPassword");
        Sickerinfo sickerinfo = new Sickerinfo(sickerCardid,sickerPhone,sickerLoginPassword,sickerUname,sickerEmail);
        SickerinfoService service = new SickerinfoService();
        Sickerinfo loginSicker = service.getSickerBySickUnameOrSickPhoneOrCardIdOrSickEmailAndPassword(sickerinfo);

        if (loginSicker!=null) {
            request.getSession().setAttribute("loginSicker",loginSicker);
            request.getRequestDispatcher("/xylq/index.jsp").forward(request,response);
        } else {
            request.setAttribute("sickerLoginMsg","用户名或密码错误");
            request.getRequestDispatcher("/xylq/sickerLogin.jsp").forward(request,response);
        }





    }
}
