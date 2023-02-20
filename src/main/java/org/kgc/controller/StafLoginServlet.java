package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-10:55
 */

import org.kgc.pojo.Stafinfo;
import org.kgc.service.StafinfoService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StafLoginServlet extends HttpServlet {
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
        int flag = 0;
        String stafLoginName = request.getParameter("stafLoginName");
        //判断用户使用哪种方式登录
        if (stafLoginName.indexOf("@") != -1) {
            email = stafLoginName;
            System.out.println(email);
        } else if (stafLoginName.length() == 11) {
            phone = stafLoginName;
        } else if (stafLoginName.length() == 18) {
            card = stafLoginName;
        } else {
            uname = stafLoginName;
        }
        System.out.println(flag);
        //将以上四种方式和密码封装成pojo传递给mapper
        String password = request.getParameter("stafLoginPassword");
        Stafinfo stafinfo = new Stafinfo(card, phone, uname, email, password);
        StafinfoService service = new StafinfoService();
        Stafinfo loginUser = service.getStaffmemberByUsernameOrstafPhoneOrStafcardOrEmailAndPassword(stafinfo);
        if (stafinfo != null&&loginUser!=null) {
            //员工表有信息,登录信息也存在,接下来判断是不是管理员
            if(loginUser.getUsername().equals("sroot")){
                //超级管理员
                request.getSession().setAttribute("loginUser", loginUser);
                response.sendRedirect("cgq&yjf/managerindex.jsp");
            }else if (loginUser.getUsername().equals("yf")){
                request.getSession().setAttribute("loginUser", loginUser);
                response.sendRedirect("selectAllDrugInfo");
            }
            else {
                //普通员工
                request.getSession().setAttribute("loginUser", loginUser);
                response.sendRedirect("toDoctorManager");
            }
        } else {
            request.setAttribute("stafLoginMsg", "用户名或密码错误");
            request.getRequestDispatcher("/cgq&yjf/stafLogin.jsp").forward(request, response);
        }
    }
}
