package org.kgc.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.SickerinfoMapper;
import org.kgc.pojo.Sickerinfo;
import org.kgc.utils.SqlSessionUtil;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-11:03
 */
public class SickerinfoService {



    public Sickerinfo getSickerBySickUnameOrSickPhoneOrCardIdOrSickEmailAndPassword(Sickerinfo loginInfo) {

        SqlSession session = SqlSessionUtil.getSqlSession();
        SickerinfoMapper mapper = session.getMapper(SickerinfoMapper.class);
        Sickerinfo result = mapper.getSickerBySickUnameOrSickPhoneOrCardIdOrSickEmailAndPassword(loginInfo);

        session.close();
        return result;
    }

    public int updateSickerInfo(Sickerinfo sickerinfo) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        SickerinfoMapper mapper = session.getMapper(SickerinfoMapper.class);
        int result = mapper.updateSickerInfo(sickerinfo);
        if (result==1){
            session.commit();
        } else {
            session.rollback();
        }
        session.close();
        return result;
    }

    public int addSickerInfo(Sickerinfo sickerinfo) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        SickerinfoMapper mapper = session.getMapper(SickerinfoMapper.class);
        int result = mapper.addSickerInfo(sickerinfo);
        if (result == 1){
            session.commit();
        } else {
            session.rollback();
        }
        session.close();
        return result;
    }

    public int insertSicker(Sickerinfo sickerinfo) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        SickerinfoMapper mapper = session.getMapper(SickerinfoMapper.class);
        int result = mapper.insertSicker(sickerinfo);
        if (result == 1){
            session.commit();
        } else {
            session.rollback();
        }
        session.close();
        return result;
    }

    public int selectSickidBySickuname(@Param("sickuname") String sickuname){
        SqlSession session = SqlSessionUtil.getSqlSession();
        SickerinfoMapper mapper = session.getMapper(SickerinfoMapper.class);
        int sickid = mapper.selectSickidBySickuname(sickuname);
        session.close();
        return sickid;
    }


}
