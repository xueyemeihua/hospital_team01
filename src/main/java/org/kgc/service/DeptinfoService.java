package org.kgc.service;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.DeptinfoMapper;
import org.kgc.pojo.Deptinfo;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

public class DeptinfoService {


    public List<Deptinfo> getDeptinfo(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptinfoMapper mapper = session.getMapper(DeptinfoMapper.class);
        List<Deptinfo> deptinfos = mapper.getDeptinfo();
        session.close();
        return deptinfos;
    }

    public List<HashMap> getDeptCount(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptinfoMapper mapper = session.getMapper(DeptinfoMapper.class);
        List<HashMap> counts = mapper.getDeptCount();
        session.close();
        return counts;
    }
    public List<Deptinfo> getDeptinfoByDeptname(@Param("deptname") String deptname){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptinfoMapper mapper = session.getMapper(DeptinfoMapper.class);
        List<Deptinfo> deptinfoByDeptname = mapper.getDeptinfoByDeptname(deptname);
        session.close();
        return deptinfoByDeptname;
    }
    public List<Deptinfo> getDeptinfoLikeDeptname(@Param("deptname") String deptname){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptinfoMapper mapper = session.getMapper(DeptinfoMapper.class);
        List<Deptinfo> deptinfoLikeDeptname = mapper.getDeptinfoLikeDeptname(deptname);
        session.close();
        return deptinfoLikeDeptname;
    }
    public int addDeptinfo(@Param("deptname") String deptname){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptinfoMapper mapper = session.getMapper(DeptinfoMapper.class);
        int i = mapper.addDeptinfo(deptname);
        if(i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        session.close();
        return i;
    }

    public int getDeptidByDeptname(@Param("deptname") String deptname){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptinfoMapper mapper = session.getMapper(DeptinfoMapper.class);
        int deptid = mapper.getDeptidByDeptname(deptname);
        session.close();
        return deptid;
    }

    public List<Deptinfo> getDeptinfoByPostid(@Param("postid") int postid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DeptinfoMapper mapper = session.getMapper(DeptinfoMapper.class);
        List<Deptinfo> deptinfoByPostid = mapper.getDeptinfoByPostid(postid);
        session.close();
        return deptinfoByPostid;
    }


}
