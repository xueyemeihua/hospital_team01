package org.kgc.mapper;

import org.kgc.pojo.Deptinfo;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import java.util.HashMap;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-10:45
 */
public interface DeptinfoMapper {

    List<Deptinfo> getAllDeptinfo();
    //查询所有部门
    List<Deptinfo> getDeptinfo();
    List<HashMap> getDeptCount();
    List<Deptinfo> getDeptinfoByDeptname(@Param("deptname") String deptname);
    List<Deptinfo> getDeptinfoLikeDeptname(@Param("deptname") String deptname);
    int addDeptinfo(String deptname);
    int getDeptidByDeptname(@Param("deptname") String deptname);
    List<Deptinfo> getDeptinfoByPostid(@Param("postid") int postid);


}
