package org.kgc.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class NotifyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

                System.out.println("接收到支付宝的异步通知请求——");
                Map<String,String[]> parameterMap=request.getParameterMap();
                System.out.println(parameterMap);
                //成功处理后返回success
                response.getWriter().write("success");
                request.getRequestDispatcher("/xylq/hospital.jsp").forward(request,response);
            }

    }

