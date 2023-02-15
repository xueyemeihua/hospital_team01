package org.kgc.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.kgc.mapper.PaibanMapper;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-08-20:04
 */
public class PaibanMapperTest {

    @Test
    public void testPaibanMapper() {

        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PaibanMapper mapper = sqlSession.getMapper(PaibanMapper.class);
        List<HashMap> paibanOne = mapper.getStafsByPaibanOneAndDeptid(1);
        System.out.println(paibanOne);

    }

}
