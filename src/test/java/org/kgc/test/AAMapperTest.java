package org.kgc.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.kgc.mapper.DeptinfoMapper;
import org.kgc.mapper.PatientMapper;
import org.kgc.pojo.Patient;
import org.kgc.utils.SqlSessionUtil;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-10:50
 */
public class AAMapperTest {

    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    PatientMapper mapper = sqlSession.getMapper(PatientMapper.class);

    @Test
    public void testDeptinfoMapper() {
       mapper.selectByPageAndCondition(3,1,5,null).forEach(patient -> System.out.println(patient));
    }

}
