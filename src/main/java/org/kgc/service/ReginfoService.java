package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.ReginfoMapper;
import org.kgc.pojo.Reginfo;
import org.kgc.utils.SqlSessionUtil;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-06-15:15
 */
public class ReginfoService {


    SqlSession session = SqlSessionUtil.getSqlSession();
    ReginfoMapper mapper = session.getMapper(ReginfoMapper.class);


    public int addReginfo(Reginfo reginfo) {
        int i = mapper.addReginfo(reginfo);
        if (i == 1) {
            session.commit();
        } else {
            session.rollback();
        }
        session.close();
        return i;
    }


}
