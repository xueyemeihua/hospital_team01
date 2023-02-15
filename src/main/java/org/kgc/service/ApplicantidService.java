package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.ApplicantidMapper;
import org.kgc.pojo.Applicant;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

public class ApplicantidService {
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);


    public int insertApplicantid(Applicant applicant){

        int i = mapper.insertApplicant(applicant);
        sqlSession.commit();
        return i;
    }

    //根据id查科室
    public String selectDeptName(int deptid){
        return mapper.selectDeptName(deptid);
    }

    //查所有应聘信息
    public List<Applicant> selectApplicants(){

        return mapper.selectApplicants();
    }


    public int selectCarid(String carid){
        return mapper.selectCarid(carid);
    }


    //根据岗位id查询应聘人信息
    public List<Applicant> selectDeptApplicants(int postid){
        return mapper.selectDeptApplicants(postid);
    }


}
