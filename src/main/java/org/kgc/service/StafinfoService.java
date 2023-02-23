package org.kgc.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.StafinfoMapper;
import org.kgc.pojo.Stafinfo;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-11:03
 */
public class StafinfoService {


    public Stafinfo getStaffmemberByUsernameOrstafPhoneOrStafcardOrEmailAndPassword(Stafinfo loginInfo) {

        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        Stafinfo result = mapper.getStaffmemberByUsernameOrstafPhoneOrStafcardOrEmailAndPassword(loginInfo);

        return result;
    }
    public List<HashMap> getStafinfos(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        List<HashMap> stafinfos = mapper.getStafinfos();
        return stafinfos;
    }

    public int addStafInfo(Stafinfo stafinfo){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        int i = mapper.addStafInfo(stafinfo);
        if(i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        return i;
    }

    public List<HashMap> getStafinfoLikeDeptnameOrPostnameOrStafname(@Param("deptname")String deptname,@Param("postname")String postname,@Param("stafname")String stafname,@Param("stafstate")int stafstate){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        List<HashMap> stafinfoLikeDeptnameOrPostnameOrStafname = mapper.getStafinfoLikeDeptnameOrPostnameOrStafname(deptname,postname,stafname,stafstate);
        return stafinfoLikeDeptnameOrPostnameOrStafname;
    }
    public int firedStafinfo(@Param("stafid") int stafid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        int i = mapper.firedStafinfo(stafid);
        if (i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        return i;
    }
    public List<HashMap> getStafinfosByStafstate(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        List<HashMap> stafinfosByStafstate = mapper.getStafinfosByStafstate();
        session.close();
        return stafinfosByStafstate;
    }


//    public int updateSickerInfo(Sickerinfo sickerinfo) {
//        int result = mapper.updateSickerInfo(sickerinfo);
//        session.commit();
//        return result;
//    }

    public List<Stafinfo> getStafmemberByDeptid(Integer deptid) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        List<Stafinfo> doctorsInDept = mapper.getStafmemberByDeptid(deptid);
        session.close();
        return doctorsInDept;
    }

    public Stafinfo getStafinfoByStafid(Integer stafid) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        Stafinfo stafinfoByStafid = mapper.getStafinfoByStafid(stafid);
        session.close();
        return stafinfoByStafid;
    }

    public List<Stafinfo> getStafinfoByDeptid(@Param("deptid")int deptid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        List<Stafinfo> stafinfoByDeptid = mapper.getStafinfoByDeptid(deptid);
        session.close();
        return stafinfoByDeptid;
    }
    public List<Stafinfo> getStafinfoByNotIn(@Param("ids")List ids){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        List<Stafinfo> stafinfoByNotIn = mapper.getStafinfoByNotIn(ids);
        session.close();
        return stafinfoByNotIn;
    }
    public List<Stafinfo> getAllStafinfos(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        List<Stafinfo> allStafinfos = mapper.getAllStafinfos();
        session.close();
        return allStafinfos;
    }
    public int updateStafinfo(Stafinfo stafinfo){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        int i = mapper.updateStafinfo(stafinfo);
        if (i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        session.close();
        return i;
    }

    public HashMap getAllByStafid(@Param("stafid")int stafid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        StafinfoMapper mapper = session.getMapper(StafinfoMapper.class);

        HashMap allByStafid = mapper.getAllByStafid(stafid);
        session.close();
        return allByStafid;
    }

}
