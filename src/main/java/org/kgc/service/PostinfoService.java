package org.kgc.service;


import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PostinfoMapper;
import org.kgc.pojo.Postinfo;
import org.kgc.pojo.Stafinfo;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

public class PostinfoService {
    SqlSession session = SqlSessionUtil.getSqlSession();
    PostinfoMapper mapper = session.getMapper(PostinfoMapper.class);

    //查询某部门下的所有岗位
    public List<Postinfo> getPostinfoBydeptid(int deptid){
        List<Postinfo> postinfos = mapper.getPostinfoBydeptid(deptid);
        return postinfos;
    }
    public List<Postinfo> getPostinfoByPostname(@Param("postname") String postname){
        List<Postinfo> postinfos = mapper.getPostinfoByPostname(postname);
        return postinfos;

    }
    public int addPostinfo(@Param("postname") String postname,@Param("deptid") int deptid){
        int i = mapper.addPostinfo(postname, deptid);
        if(i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        return i;
    }
    public List<Postinfo> getPostinfo(){
        List<Postinfo> postinfos = mapper.getPostinfo();
        return postinfos;
    }

    public List<Postinfo> getPostinfoLikePostname(@Param("postname") String postname){
        List<Postinfo> postinfos = mapper.getPostinfoLikePostname(postname);
        return postinfos;
    }
    public int getPostidByPostname(@Param("postname")String postname){
        int postid = mapper.getPostidByPostname(postname);
        return postid;
    }
    public String getPostNameByPostid(@Param("postid") int postid){
        return mapper.getPostNameByPostid(postid);
    }




}
