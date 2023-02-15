package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;

import java.util.HashMap;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-18:58
 */
public interface RankinfoMapper {

    HashMap getRegfeeidByRankid(@Param("rankid") Integer rankid);

}
