package org.kgc.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.kgc.mapper.CaseinfoMapper;
import org.kgc.mapper.DeptinfoMapper;
import org.kgc.pojo.CaseInfo;
import org.kgc.utils.DateUtil;
import org.kgc.utils.SqlSessionUtil;

import java.util.Date;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-10:50
 */
public class DeptinfoMapperTest {

    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    DeptinfoMapper mapper = sqlSession.getMapper(DeptinfoMapper.class);
    CaseinfoMapper caseinfoMapper = sqlSession.getMapper(CaseinfoMapper.class);

    @Test
    public void testDeptinfoMapper() {
        mapper.getAllDeptinfo().forEach(deptinfo -> System.out.println(deptinfo));
    }

    @Test
    public void test02() {

        try {
            caseinfoMapper.updateCaseinfo(new CaseInfo(5,"","补钙", ""));
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
        sqlSession.commit();

    }
}
