package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.RankinfoMapper;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-19:14
 */
public class RankinfoService {


    public HashMap getRegfeeidByRankid(Integer rankid) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        RankinfoMapper mapper = session.getMapper(RankinfoMapper.class);
        HashMap regfeeidByRankid = mapper.getRegfeeidByRankid(rankid);
        session.close();
        return regfeeidByRankid ;
    }

}
