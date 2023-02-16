package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.LeavewordMapper;
import org.kgc.pojo.Leaveword;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-04-10:23
 */
public class LeavewordService {


    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    LeavewordMapper mapper = sqlSession.getMapper(LeavewordMapper.class);

    public int addLeaveWord(Leaveword leaveword) {
        int i = mapper.addLeaveWord(leaveword);
        if (i == 1){
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        return i;
    }

    public List<HashMap> getAllLeavewords() {
        return mapper.getAllLeavewords();
    }

}
