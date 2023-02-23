package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.SickerRegResult;

import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-20-12:08
 */
public interface SickerRegResultMapper {

    List<SickerRegResult> getSrrByStafid(@Param("date") String date, @Param("stafid") int stafid);

}
