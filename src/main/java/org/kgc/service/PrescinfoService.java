package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PrescinfoMapper;
import org.kgc.pojo.Prescinfo;
import org.kgc.utils.SqlSessionUtil;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-21-0:43
 */
public class PrescinfoService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    PrescinfoMapper mapper = session.getMapper(PrescinfoMapper.class);

    public int insertPresc(Prescinfo pre){
        int i = mapper.insertPresc(pre);
        session.commit();
        session.close();
        return i;
    }

}
