package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-15:39
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import org.kgc.pojo.Stafinfo;
import org.kgc.service.PaibanService;
import org.kgc.service.StafinfoService;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class SelectDoctorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");
        Integer deptid = Integer.parseInt(request.getParameter("deptid"));
        Integer weeknum = Integer.parseInt(request.getParameter("weeknum"));
        PaibanService service = new PaibanService();
        List<HashMap> stafs = null;
        switch (weeknum) {
            case 1:
                stafs = service.getStafsByPaibanOneAndDeptid(deptid);
                break;
            case 2:
                stafs = service.getStafsByPaibanTwoAndDeptid(deptid);
                break;
            case 3:
                stafs = service.getStafsByPaibanThreeAndDeptid(deptid);
                break;
            case 4:
                stafs = service.getStafsByPaibanFourAndDeptid(deptid);
                break;
            case 5:
                stafs = service.getStafsByPaibanFiveAndDeptid(deptid);
                break;
            case 6:
                stafs = service.getStafsByPaibanSixAndDeptid(deptid);
                break;
            case 7:
                stafs = service.getStafsByPaibanSevenAndDeptid(deptid);
                break;
            default:
                //根据病人选择的科室以及日期查询该科室下的所有医生
                stafs = service.getStafsByPaibanOneAndDeptid(deptid);
                break;
        }

        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(stafs);
        response.getWriter().println(s);
    }
}
