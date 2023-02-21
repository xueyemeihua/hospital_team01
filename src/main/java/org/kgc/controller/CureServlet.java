package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-21-15:49
 */

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class CureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




    }
}
