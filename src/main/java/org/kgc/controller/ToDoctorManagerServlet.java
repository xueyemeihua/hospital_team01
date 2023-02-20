package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-20-11:26
 */

import org.kgc.pojo.SickerRegResult;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.SickerRegResultService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


public class ToDoctorManagerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        Stafinfo loginUser = (Stafinfo) request.getSession().getAttribute("loginUser");
        int stafid = loginUser.getStafid();

        SickerRegResultService service = new SickerRegResultService();
        List<SickerRegResult> regResults = service.getSrrByStafid(stafid);
        request.setAttribute("regResults",regResults);
        request.getRequestDispatcher("/doctor/yisheng.jsp").forward(request,response);

    }
}
