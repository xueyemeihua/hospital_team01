package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.*;

import java.util.List;

public interface CaseMapper {
    //查询所有病例信息
    List<Case> selectAll();
    //根据病人编号查询该病人的病例信息
    List<Case> selectByIdCase(@Param("stafid") int stafid, @Param("sickid") int sickid, @Param("regid") int regid);
    //根据病人编号查询该病人的病例信息(分页查询)
    List<Case> selectByPageAndCondition(@Param("begin") int begin,@Param("size") int size,@Param("bingli") Case bingli);
    //根据病人编号查询该病人的病例信息(分页查询)
    List<Case> selectByPageAndStafid(@Param("begin") int begin,@Param("size") int size,@Param("stafid") int stafid);
    //根据病例编号查询该病人的病例的详细信息
    Case selectByCaseId(int caseid);
    //修改病例信息
    void updateCase(CaseInfo bingli);
    //修改收费标准信息
    void updateRegfee(Regfeestander regfeestander);
    //修改工作人员信息
    void updateStaf(Stafinfo stafinfo);
    //根据工作人员比编号查询工作人员信息
    Stafinfo selectByStafId(int stafid);
    //根据科室编号查询科室信息
    Rankinfo selectByRankId(int rankid);
    //根据收费标准编号查询收费标准信息
    Regfeestander selectByRegfeeStanderId(int regfeeid);
    //根据病人id查询病人信息
    CaseInfo selectByCaseInfoId(int caseid);
    //根据条件查询总记录数
    int selectTotalCountByCondition(Case bingli);
    //根据条件查询总记录数
    int selectTotalCountByStafid(int stafid);

}
