package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.DataForShowMapper;
import org.kgc.pojo.CaseNumByDoctor;
import org.kgc.pojo.HotDrug;
import org.kgc.pojo.MCNDD;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-15:21
 */
public class DataForShowService {


    /*每个医生接诊的病例数*/
    public List<CaseNumByDoctor> getCaseNumByDept() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        DataForShowMapper mapper = session.getMapper(DataForShowMapper.class);
        List<CaseNumByDoctor> caseNumByDoctor = mapper.getCaseNumByDept();
        session.close();
        return caseNumByDoctor;
    }

    /*每个科室的医生人数*/
    public List<HashMap> getDoctorNumByDept() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        DataForShowMapper mapper = session.getMapper(DataForShowMapper.class);
        List<HashMap> doctorNumByDept = mapper.getDoctorNumByDept();
        session.close();
        return doctorNumByDept;
    }

    /*热门药品*/
    public List<HotDrug> getHotDrug() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        DataForShowMapper mapper = session.getMapper(DataForShowMapper.class);
        List<HotDrug> hotDrug = mapper.getHotDrug();
        session.close();
        return hotDrug;
    }

    /*每个部门接诊病例最多的医生*/
    public List<MCNDD> getMostCaseNumForDoctorByDept(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DataForShowMapper mapper = session.getMapper(DataForShowMapper.class);
        List<MCNDD> mostCase = mapper.getMostCaseNumForDoctorByDept();
        session.close();
        return mostCase;
    }




}
