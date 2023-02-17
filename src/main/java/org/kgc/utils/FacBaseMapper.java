package org.kgc.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.kgc.mapper.FacMapper;

import java.io.InputStream;

public class FacBaseMapper {
    public static FacMapper getMapper(){
        SqlSession session = null;
        FacMapper mapper = null;
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            session = sqlSessionFactory.openSession(true);//true自动提交

            //返回接口的代理对象
            mapper = session.getMapper(FacMapper.class);

        } catch (Exception e) {

        }
        return mapper;

    }
}
