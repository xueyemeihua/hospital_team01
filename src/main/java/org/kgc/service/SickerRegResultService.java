package org.kgc.service;

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

    SqlSession session = SqlSessionUtil.getSqlSession();
    SickerRegResultMapper mapper = session.getMapper(SickerRegResultMapper.class);

    public List<SickerRegResult> getSrrByStafid(String date,int stafid) {
        List<SickerRegResult> regResults = mapper.getSrrByStafid(date,stafid);
        session.close();
        return regResults;
    }



}
