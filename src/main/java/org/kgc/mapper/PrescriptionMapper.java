package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.DrugInfo;
import org.kgc.pojo.PrescInfo;
import org.kgc.pojo.Prescription;

import java.util.List;

public interface PrescriptionMapper {
    //根据药品名称查询药品信息
    DrugInfo selectByNameDrug(String drugname);
    //根据处方编号查询病例信息
    Prescription selectByIdPresc(int prescid);
    //添加处方单数据
    void addPresc(@Param("prescInfos") List<PrescInfo> prescInfos);
    //根据病例编号查询处方信息
    Prescription selectByIdBingli(int caseid);
    //根据处方单编号查询药品信息
    Prescription selectByPrescid(int prescid);
    //根据病例编号查询处方单
    List<Prescription> getPrescByCaseid(int caseid);

}
