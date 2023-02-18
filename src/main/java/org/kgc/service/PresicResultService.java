package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PresicResultMapper;
import org.kgc.pojo.PresicResult;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-12-15:41
 */
public class PresicResultService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    PresicResultMapper mapper = session.getMapper(PresicResultMapper.class);

    public List<PresicResult> getPresicByCaseid(int caseid) {
        List<PresicResult> presicByCaseid = mapper.getPresicByCaseid(caseid);
        session.close();
        return presicByCaseid;
    }

}
