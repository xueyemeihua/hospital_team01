package org.kgc.service;

import org.kgc.pojo.PageBean;
import org.kgc.pojo.Patient;

import java.util.List;

public interface PatientService {
    //查询全部病人信息
    List<Patient> selectAll();
    //分页查询
    PageBean<Patient> selectByPage(int currentPage, int pageSize);
    //分页条件查询
    PageBean<Patient>  selectByPageAndCondition(int stafid,int currentPage, int pageSize, Patient patient);

}
