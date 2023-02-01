package org.kgc.controller; /**
 * @author 雪夜梅花香_ly
 * @create 2023-02-01-20:05
 */

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.StafinfoMapper;
import org.kgc.pojo.Stafinfo;
import org.kgc.utils.SqlSessionUtil;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        Stafinfo stafinfo = new Stafinfo();
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        stafinfo.setEmail(email);
        stafinfo.setPassword(password);

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = sqlSession.getMapper(StafinfoMapper.class);
        List<Stafinfo> stafinfos = mapper.selectByCondition(stafinfo);
        System.out.println(stafinfos);
        sqlSession.close();
        //获取字符输出流，并设置content type
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        //3. 判断user释放为null
        if(stafinfos.size() != 0){
            // 登陆成功
            writer.write("good");
        }else {
            // 登陆失败
            writer.write("not good");
        }

    }
}
