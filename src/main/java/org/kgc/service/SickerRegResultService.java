package org.kgc.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.SickerRegResultMapper;
import org.kgc.pojo.SickerRegResult;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-20-12:10
 */
public class SickerRegResultService {



    public List<SickerRegResult> getSrrByStafid(@Param("date") String date, @Param("stafid") int stafid) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        SickerRegResultMapper mapper = session.getMapper(SickerRegResultMapper.class);
        List<SickerRegResult> regResults = mapper.getSrrByStafid(date,stafid);
        session.close();
        return regResults;
    }



}
