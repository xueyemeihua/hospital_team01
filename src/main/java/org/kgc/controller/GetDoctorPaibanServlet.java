package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-09-13:55
 */

import org.kgc.service.PaibanService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class GetDoctorPaibanServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //按照部门分组查询所有医生的排班
        PaibanService service = new PaibanService();
        List<HashMap> stafsByGroupOnDept = service.getStafsByGroupOnDept();
        request.getSession().setAttribute("stafsByGroupOnDept",stafsByGroupOnDept);
        response.sendRedirect("xylq/paiban.jsp");
    }
}
