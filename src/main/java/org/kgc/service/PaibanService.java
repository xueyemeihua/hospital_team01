package org.kgc.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PaibanMapper;
import org.kgc.pojo.Stafinfo;
import org.kgc.utils.SqlSessionUtil;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-08-21:04
 */
public class PaibanService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    PaibanMapper mapper = session.getMapper(PaibanMapper.class);

    public List<HashMap> getPaibanStafByDate(@Param("date") String date){
        List<HashMap> paibanStafByDate = mapper.getPaibanStafByDate(date);
        session.close();
        return paibanStafByDate;
    }
    public int addDuty(@Param("stafid")int stafid,@Param("date")String date){
        int i = mapper.addDuty(stafid, date);
        if (i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        session.close();
        return i;
    }

    public int deleteDuty(@Param("stafid")int stafid,@Param("date")String date){
        int i = mapper.deleteDuty(stafid, date);
        if (i!=0){
            session.commit();
        }else {
            session.rollback();
        }
        session.close();
        return i;
    }

    public List<HashMap> selectDoctorByDateAndByDeptid(@Param("date")String date,@Param("deptid")int deptid){
        List<HashMap> hashMaps = mapper.selectDoctorByDateAndByDeptid(date, deptid);
        session.close();
        return hashMaps;
    }



}
