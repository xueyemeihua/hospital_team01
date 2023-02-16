package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Paiban;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-08-19:49
 */
public interface PaibanMapper {

    List<Paiban> getPaibanByDate(@Param("date")String date);


}
