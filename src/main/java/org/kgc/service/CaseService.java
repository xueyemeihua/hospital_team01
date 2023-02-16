package org.kgc.service;

import org.kgc.pojo.*;

import java.util.List;

public interface CaseService {
    //查询所有病例信息
    List<Case> selectAll();

    //根据病人编号查询该病人的病例信息
    List<Case> selectByIdCase(int stafid, int sickid, int regid);

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

    //根据病人编号查询该病人的病例信息(分页查询)
    PageBean<Case> selectByPageAndCondition(int currentPage, int pageSize, Case bingli);

    PageBean<Case> selectByPageAndStafid(int begin, int size, int stafid);
}
