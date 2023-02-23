package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.ApplicantidMapper;
import org.kgc.pojo.Applicant;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

public class ApplicantidService {


    public int insertApplicantid(Applicant applicant){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);


        int i = mapper.insertApplicant(applicant);
        if(i!=0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return i;
    }

    //根据id查科室
    public String selectDeptName(int deptid){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);

        String s = mapper.selectDeptName(deptid);
        sqlSession.close();
        return s;
    }

    //查所有应聘信息
    public List<Applicant> selectApplicants(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);

        List<Applicant> applicants = mapper.selectApplicants();
        sqlSession.close();
        return applicants;
    }


    public int selectCarid(String carid){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);

        int i = mapper.selectCarid(carid);
        sqlSession.close();
        return i;
    }


    //根据岗位id查询应聘人信息
    public List<Applicant> selectDeptApplicants(int postid){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);

        List<Applicant> applicants = mapper.selectDeptApplicants(postid);
        sqlSession.close();
        return applicants;
    }
    public List<HashMap> selectApplicantsBystate(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);

        List<HashMap> applicants = mapper.selectApplicantsBystate();
        sqlSession.close();
        return applicants;
    }

    public int updateApplicantstatus(int applicantid){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);

        int i = mapper.updateApplicantstatus(applicantid);
        if(i!=0){
            sqlSession.commit();
        }else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return i;
    }



}
