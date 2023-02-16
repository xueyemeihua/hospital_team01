package org.kgc.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PaibanMapper;
import org.kgc.pojo.Paiban;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-08-21:04
 */
public class PaibanService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    PaibanMapper mapper = session.getMapper(PaibanMapper.class);

    public List<Paiban> getPaibanByDate(@Param("date")String date){
        List<Paiban> paibans = mapper.getPaibanByDate(date);
        return paibans;
    }

}
