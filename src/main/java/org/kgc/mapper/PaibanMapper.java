package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Stafinfo;

import java.util.Date;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-08-19:49
 */
public interface PaibanMapper {


    List<HashMap> getPaibanStafByDate(@Param("date") String date);
    int addDuty(@Param("stafid")int stafid,@Param("date")String date);
    int deleteDuty(@Param("stafid")int stafid,@Param("date")String date);


}
