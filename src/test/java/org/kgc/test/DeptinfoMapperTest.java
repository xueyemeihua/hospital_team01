package org.kgc.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.kgc.mapper.CaseinfoMapper;
import org.kgc.mapper.DeptinfoMapper;
import org.kgc.mapper.DrugInfoMapper;
import org.kgc.pojo.CaseInfo;
import org.kgc.utils.DateUtil;
import org.kgc.utils.SqlSessionUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-10:50
 */
public class DeptinfoMapperTest {

    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    DeptinfoMapper mapper = sqlSession.getMapper(DeptinfoMapper.class);
    CaseinfoMapper caseinfoMapper = sqlSession.getMapper(CaseinfoMapper.class);
    DrugInfoMapper drugInfoMapper = sqlSession.getMapper(DrugInfoMapper.class);

    @Test
    public void testDeptinfoMapper() {
        mapper.getAllDeptinfo().forEach(deptinfo -> System.out.println(deptinfo));
    }

    @Test
    public void test02() {

        try {
            caseinfoMapper.updateCaseinfo(new CaseInfo(5,"","补钙", DateUtil.format(new Date(),"yyyy-MM-dd HH:mm:ss")));
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        }
        sqlSession.commit();

    }

    @Test
    public void test03() {

        drugInfoMapper.mohuSearchDrug("方", "解").forEach(map -> System.out.println(map));

    }
}
