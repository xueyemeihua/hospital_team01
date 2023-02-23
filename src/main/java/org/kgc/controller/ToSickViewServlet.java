package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-22-13:27
 */

import org.kgc.pojo.Sickerinfo;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class ToSickViewServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        /*获取登录的病人信息*/
        Sickerinfo loginSicker = (Sickerinfo) request.getSession().getAttribute("loginSicker");

        if (loginSicker!=null){
            //登录过,直接进入个人中心
            request.getRequestDispatcher("/xylq/hospital_main.jsp").forward(request,response);

        } else {
            //跳转登录界面
            request.getRequestDispatcher("/xylq/sicker_login.html").forward(request,response);

        }




    }
}
