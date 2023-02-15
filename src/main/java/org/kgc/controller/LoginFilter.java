package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-07-13:29
 */

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        //转型
        HttpServletRequest hsr = (HttpServletRequest) request;
        HttpServletResponse hsresponse = (HttpServletResponse) response;
        //获得链接和登录名
        String requestURI = hsr.getRequestURI();
        Object loginUser = hsr.getSession().getAttribute("loginUser");
        if (loginUser!=null || requestURI.indexOf("Login")>=0 || requestURI.indexOf("Reg")>=0 || requestURI.indexOf("index")>=0 || requestURI.indexOf("hospital_main")>=0 ) {
            //只有登录过或者在做登录注册主页请求时,过滤器就放行
            chain.doFilter(hsr,response);
        } else {
            hsresponse.sendRedirect("/xylq/sicker_login.html");
        }


    }
}
