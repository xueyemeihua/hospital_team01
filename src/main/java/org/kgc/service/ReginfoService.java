package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.CaseinfoMapper;
import org.kgc.mapper.ReginfoMapper;
import org.kgc.pojo.Reginfo;
import org.kgc.utils.SqlSessionUtil;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-15:15
 */
public class ReginfoService {




    /*根据挂号信息添加病例信息*/
    public int addReginfo(Reginfo reginfo) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        ReginfoMapper mapper = session.getMapper(ReginfoMapper.class);
        CaseinfoMapper caseinfoMapper = session.getMapper(CaseinfoMapper.class);
        int i = 0;
        try {
            i = mapper.addReginfo(reginfo);
            caseinfoMapper.addCaseinfo(reginfo);
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
        session.commit();
        session.close();
        return i;
    }


}
