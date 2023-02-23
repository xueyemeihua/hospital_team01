package org.kgc.mapper;

import org.kgc.pojo.CaseNumByDoctor;
import org.kgc.pojo.HotDrug;
import org.kgc.pojo.MCNDD;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-15:20
 */
public interface DataForShowMapper {

    /*每个医生接诊的病例数*/
    List<CaseNumByDoctor> getCaseNumByDept();

    /*每个科室的医生人数*/
    List<HashMap> getDoctorNumByDept();

    /*热门药品*/
    List<HotDrug> getHotDrug();

    /*每个部门接诊病例最多的医生*/

    List<MCNDD> getMostCaseNumForDoctorByDept();

}
