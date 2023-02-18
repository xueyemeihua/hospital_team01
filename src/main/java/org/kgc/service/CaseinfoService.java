package org.kgc.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.CaseinfoMapper;
import org.kgc.pojo.CaseResult;

import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-11-19:11
 */
public class CaseinfoService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    CaseinfoMapper mapper = session.getMapper(CaseinfoMapper.class);

    public List<CaseResult> getCaseinfoBySickid(int sickid) {
        List<CaseResult> caseinfoBySickid = mapper.getCaseinfoBySickid(sickid);
        session.close();
        return caseinfoBySickid;
    }

}
