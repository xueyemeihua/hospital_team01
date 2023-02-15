package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-08-19:49
 */
public interface PaibanMapper {

    //查询周一某个部门所有的有班医生
    List<HashMap> getStafsByPaibanOneAndDeptid(@Param("deptid") Integer deptid);
    //查询周二某个部门所有的有班医生
    List<HashMap> getStafsByPaibanTwoAndDeptid(@Param("deptid") Integer deptid);
    //查询周三某个部门所有的有班医生
    List<HashMap> getStafsByPaibanThreeAndDeptid(@Param("deptid") Integer deptid);
    //查询周四某个部门所有的有班医生
    List<HashMap> getStafsByPaibanFourAndDeptid(@Param("deptid") Integer deptid);
    //查询周五某个部门所有的有班医生
    List<HashMap> getStafsByPaibanFiveAndDeptid(@Param("deptid") Integer deptid);
    //查询周六某个部门所有的有班医生
    List<HashMap> getStafsByPaibanSixAndDeptid(@Param("deptid") Integer deptid);
    //查询周日某个部门所有的有班医生
    List<HashMap> getStafsByPaibanSevenAndDeptid(@Param("deptid") Integer deptid);


    //按照部门排序查询所有医生排班
    List<HashMap> getStafsByGroupOnDept();


}
