package org.kgc.service;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PostinfoMapper;
import org.kgc.pojo.Postinfo;
import org.kgc.pojo.Stafinfo;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

public class PostinfoService {


    //查询某部门下的所有岗位
    public List<Postinfo> getPostinfoBydeptid(int deptid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        PostinfoMapper mapper = session.getMapper(PostinfoMapper.class);
        List<Postinfo> postinfos = mapper.getPostinfoBydeptid(deptid);
        session.close();
        return postinfos;
    }
    public List<Postinfo> getPostinfoByPostname(@Param("postname") String postname){
        SqlSession session = SqlSessionUtil.getSqlSession();
        PostinfoMapper mapper = session.getMapper(PostinfoMapper.class);
        List<Postinfo> postinfos = mapper.getPostinfoByPostname(postname);
        session.close();
        return postinfos;

    }
    public int addPostinfo(@Param("postname") String postname,@Param("deptid") int deptid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        PostinfoMapper mapper = session.getMapper(PostinfoMapper.class);
        int i = mapper.addPostinfo(postname, deptid);
        if(i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        session.close();
        return i;
    }
    public List<Postinfo> getPostinfo(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        PostinfoMapper mapper = session.getMapper(PostinfoMapper.class);
        List<Postinfo> postinfos = mapper.getPostinfo();
        session.close();
        return postinfos;
    }

    public List<Postinfo> getPostinfoLikePostname(@Param("postname") String postname){
        SqlSession session = SqlSessionUtil.getSqlSession();
        PostinfoMapper mapper = session.getMapper(PostinfoMapper.class);
        List<Postinfo> postinfos = mapper.getPostinfoLikePostname(postname);
        session.close();
        return postinfos;
    }
    public int getPostidByPostname(@Param("postname")String postname){
        SqlSession session = SqlSessionUtil.getSqlSession();
        PostinfoMapper mapper = session.getMapper(PostinfoMapper.class);
        int postid = mapper.getPostidByPostname(postname);
        session.close();
        return postid;
    }
    public String getPostNameByPostid(@Param("postid") int postid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        PostinfoMapper mapper = session.getMapper(PostinfoMapper.class);
        String postNameByPostid = mapper.getPostNameByPostid(postid);
        session.close();
        return postNameByPostid;
    }




}
