package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.DataForShowMapper;
import org.kgc.pojo.HotDrug;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-15:21
 */
public class DataForShowService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    DataForShowMapper mapper = session.getMapper(DataForShowMapper.class);

    /*每个医生接诊的病例数*/
    public List<HashMap> getCaseNumByDoctor() {
        SqlSession session = SqlSessionUtil.getSqlSession();
        DataForShowMapper mapper = session.getMapper(DataForShowMapper.class);
        List<HashMap> caseNumByDoctor = mapper.getCaseNumByDoctor();
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
    public List<HashMap> getMostCaseNumForDoctorByDept(){
        SqlSession session = SqlSessionUtil.getSqlSession();
        DataForShowMapper mapper = session.getMapper(DataForShowMapper.class);
        List<HashMap> mostCase = mapper.getMostCaseNumForDoctorByDept();
        session.close();
        return mostCase;
    }




}
