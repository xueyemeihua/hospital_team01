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
    public void testAddSickerInfo() {
        Sickerinfo sickerinfo = new Sickerinfo(0, "1", "a", "2", "3", "2@1");
        int i = mapper.addSickerInfo(sickerinfo);
        if (i == 1){
            session.commit();
        } else {
            session.rollback();
        }
        System.out.println(sickerinfo);


    }

}
