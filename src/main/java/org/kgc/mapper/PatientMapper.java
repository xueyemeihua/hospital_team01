package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Patient;

import java.util.List;

public interface PatientMapper {
    //查询全部病人信息
    List<Patient> selectAll();
    //分页查询
    List<Patient> selectByPage(@Param("begin") int begin,@Param("size") int size);
    //查询总记录数
    int selectTotalCount();
    //分页条件查询
    List<Patient> selectByPageAndCondition(@Param("begin") int begin, @Param("size") int size, @Param("patient") Patient patient);
    //根据条件查询总记录数
    int selectTotalCountByCondition(Patient patient);
}
