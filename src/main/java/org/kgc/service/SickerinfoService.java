package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.SickerinfoMapper;
import org.kgc.pojo.Sickerinfo;
import org.kgc.utils.SqlSessionUtil;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-11:03
 */
public class SickerinfoService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    SickerinfoMapper mapper = session.getMapper(SickerinfoMapper.class);

    public Sickerinfo getSickerBySickUnameOrSickPhoneOrCardIdOrSickEmailAndPassword(Sickerinfo loginInfo) {

        Sickerinfo result = mapper.getSickerBySickUnameOrSickPhoneOrCardIdOrSickEmailAndPassword(loginInfo);

        return result;
    }

    public int updateSickerInfo(Sickerinfo sickerinfo) {
        int result = mapper.updateSickerInfo(sickerinfo);
        session.commit();
        return result;
    }
}
