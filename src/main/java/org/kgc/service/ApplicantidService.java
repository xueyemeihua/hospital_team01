package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.ApplicantidMapper;
import org.kgc.pojo.Applicant;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

public class ApplicantidService {
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    ApplicantidMapper mapper = sqlSession.getMapper(ApplicantidMapper.class);


    public int insertApplicantid(Applicant applicant) {

        int i = mapper.insertApplicant(applicant);
        if (i != 0) {
            sqlSession.commit();
        } else {
            sqlSession.rollback();
        }
        sqlSession.close();
        return i;
    }

    //根据id查科室
    public String selectDeptName(int deptid) {
        String s = mapper.selectDeptName(deptid);
        sqlSession.close();
        return s;
    }

    //查所有应聘信息
    public List<Applicant> selectApplicants() {
        List<Applicant> applicants = mapper.selectApplicants();
        sqlSession.close();
        return applicants;
    }


    public int selectCarid(String carid) {
        int i = mapper.selectCarid(carid);
        sqlSession.close();
        return i;
    }


    //根据岗位id查询应聘人信息
    public List<Applicant> selectDeptApplicants(int postid) {
        List<Applicant> applicants = mapper.selectDeptApplicants(postid);
        sqlSession.close();
        return applicants;
    }


    //查所有
    public List<Applicant> selectSuccessfulApplicants() {
        List<Applicant> applicants = mapper.SelectSuccessfulApplications();
        sqlSession.close();
        return applicants;
    }

    //模糊查询
    public List<Applicant> FuzzySearchSuccessfulApplicationServlet(String name, String email) {
        List<Applicant> applicantList = mapper.FuzzySearchSuccessfulApplicationServlet(name, email);
        sqlSession.close();
        return applicantList;

    }


}
