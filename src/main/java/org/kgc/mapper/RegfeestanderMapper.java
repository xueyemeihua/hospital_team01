package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Regfeestander;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-18:39
 */
public interface RegfeestanderMapper {

    Regfeestander getRegfeestanderByRankid(@Param("rankid") Integer rankid);

}
