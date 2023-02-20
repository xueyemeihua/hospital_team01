package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.CaseInfo;
import org.kgc.pojo.CaseResult;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 *  * @create 2023-02-11-19:10
 */
public interface CaseinfoMapper {

    List<CaseResult> getCaseinfoBySickid(@Param("sickid") int sickid);

    /**
     * 根据病人编号,挂号编号和医生编号查询该医生名下该病人的病例信息
     */
    List<CaseInfo> getCaSeByStafidAndSickidAndRegid(@Param("regid") int regid, @Param("sickid") int sickid, @Param("stafid") int stafid);

}
