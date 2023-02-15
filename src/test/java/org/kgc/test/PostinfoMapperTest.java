package org.kgc.test;

import org.junit.Test;
import org.kgc.mapper.PostinfoMapper;
import org.kgc.utils.SqlSessionUtil;

public class PostinfoMapperTest {
    @Test
    public void test01(){
        PostinfoMapper mapper = SqlSessionUtil.getSqlSession().getMapper(PostinfoMapper.class);
        System.out.println(mapper.getPostinfoBydeptid(1));
    }
}
