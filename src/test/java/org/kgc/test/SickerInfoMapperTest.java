package org.kgc.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.kgc.mapper.SickerinfoMapper;
import org.kgc.pojo.Sickerinfo;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-12:16
 */
public class SickerInfoMapperTest {

    SqlSession session = SqlSessionUtil.getSqlSession();
    SickerinfoMapper mapper = session.getMapper(SickerinfoMapper.class);
    @Test
    public void testSickerinfoMapper() {

        System.out.println(mapper.getSickerBySickUnameOrSickPhoneOrCardIdOrSickEmailAndPassword(new Sickerinfo(null,null,"111",null,"123")));

    }

}
