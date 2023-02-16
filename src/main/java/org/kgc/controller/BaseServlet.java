package org.kgc.controller;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//替换 HttpServlet,根据请求最后一段路径来进行方法分发
public class BaseServlet extends HttpServlet {
    //根据请求最后一段路径来进行方法分发
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1. 获取请求路径
        String uri = request.getRequestURI();// /emp-case/emp/selectAll
        //2. 获取最后一段路径,方法名
        // index 最后一段斜杠" / "的索引
        int index = uri.lastIndexOf('/');
        String methodName = uri.substring(index + 1);// /selectAll

        //2. 执行方法
        //2.1 获取 EmpServlet 字节码对象 class
        Class<? extends BaseServlet> cls = this.getClass();
        //2.2 获取方法 Method 对象
        try {
            Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            //2.3 执行方法
            method.invoke(this,request,response);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
