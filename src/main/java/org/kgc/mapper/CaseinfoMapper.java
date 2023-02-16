package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.CaseResult;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 *  * @create 2023-02-11-19:10
 */
public interface CaseinfoMapper {

    List<CaseResult> getCaseinfoBySickid(@Param("sickid") int sickid);

}
