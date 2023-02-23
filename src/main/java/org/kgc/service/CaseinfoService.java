package org.kgc.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.CaseinfoMapper;
import org.kgc.pojo.CaseInfo;
import org.kgc.pojo.CaseResult;

import org.kgc.pojo.Reginfo;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-11-19:11
 */
public class CaseinfoService {



    public List<CaseResult> getCaseinfoBySickid(int sickid) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        CaseinfoMapper mapper = session.getMapper(CaseinfoMapper.class);
        List<CaseResult> caseinfoBySickid = mapper.getCaseinfoBySickid(sickid);
        session.close();
        return caseinfoBySickid;
    }

    public List<CaseInfo> getCaSeByStafidAndSickidAndRegid(int regid,int sickid,int stafid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        CaseinfoMapper mapper = session.getMapper(CaseinfoMapper.class);
        List<CaseInfo> caseinfos = mapper.getCaSeByStafidAndSickidAndRegid(regid, sickid, stafid);
        session.close();
        return caseinfos;
    }

    public int updateCaseinfo(CaseInfo caseInfo){
        SqlSession session = SqlSessionUtil.getSqlSession();
        CaseinfoMapper mapper = session.getMapper(CaseinfoMapper.class);
        int i = 0;
        try {
            i = mapper.updateCaseinfo(caseInfo);
        } catch (Exception e) {
            e.printStackTrace();
            session.rollback();
        }
        session.commit();
        session.close();
        return i;
    }

    public List<HashMap> getCaseinfoByStafid(@Param("stafid")int stafid){
        SqlSession session = SqlSessionUtil.getSqlSession();
        CaseinfoMapper mapper = session.getMapper(CaseinfoMapper.class);
        List<HashMap> caseinfo = mapper.getCaseinfoByStafid(stafid);
        session.close();
        return caseinfo;
    }

    public List<HashMap> getCaseinfoBy(@Param("sickname")String sickname,@Param("diagnosis")String diagnosis,@Param("curescheme")String curescheme){
        SqlSession session = SqlSessionUtil.getSqlSession();
        CaseinfoMapper mapper = session.getMapper(CaseinfoMapper.class);
        List<HashMap> caseinfo = mapper.getCaseinfoBy(sickname, diagnosis, curescheme);
        session.close();
        return caseinfo;

    }


}
