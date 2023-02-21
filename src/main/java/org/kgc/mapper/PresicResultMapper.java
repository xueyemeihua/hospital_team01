package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Prescinfo;
import org.kgc.pojo.PresicResult;

import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-12-15:39
 */
public interface PresicResultMapper {

    List<PresicResult> getPresicByCaseid(@Param("caseid") int caseid);



}
