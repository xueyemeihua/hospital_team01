package org.kgc.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.kgc.mapper.DeptinfoMapper;
import org.kgc.utils.SqlSessionUtil;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-10:50
 */
public class DeptinfoMapperTest {

    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    DeptinfoMapper mapper = sqlSession.getMapper(DeptinfoMapper.class);

    @Test
    public void testDeptinfoMapper() {
        mapper.getAllDeptinfo().forEach(deptinfo -> System.out.println(deptinfo));
    }

}
