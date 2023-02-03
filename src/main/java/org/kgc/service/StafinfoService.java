package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.StafinfoMapper;
import org.kgc.pojo.Stafinfo;
import org.kgc.utils.SqlSessionUtil;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-11:03
 */
public class StafinfoService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

    public Stafinfo getStaffmemberByUsernameOrstafPhoneOrStafcardOrEmailAndPassword(Stafinfo loginInfo) {

        Stafinfo result = mapper.getStaffmemberByUsernameOrstafPhoneOrStafcardOrEmailAndPassword(loginInfo);

        return result;
    }

//    public int updateSickerInfo(Sickerinfo sickerinfo) {
//        int result = mapper.updateSickerInfo(sickerinfo);
//        session.commit();
//        return result;
//    }
}
