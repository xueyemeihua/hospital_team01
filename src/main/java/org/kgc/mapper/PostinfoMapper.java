package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Postinfo;

import java.util.List;

public interface PostinfoMapper {
    ////查询某部门下的所有岗位
    List<Postinfo> getPostinfoBydeptid(int deptid);
    List<Postinfo> getPostinfoByPostname(@Param("postname") String postname);
    int addPostinfo(@Param("postname") String postname,@Param("deptid") int deptid);
    List<Postinfo> getPostinfo();
    List<Postinfo> getPostinfoLikePostname(@Param("postname") String postname);
    int getPostidByPostname(@Param("postname")String postname);
    String getPostNameByPostid(@Param("postid") int postid);
}
