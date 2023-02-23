package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Applicant;

import java.util.HashMap;
import java.util.List;


public interface ApplicantidMapper {

    public int insertApplicant(Applicant applicant);


    public String selectDeptName(int deptid);


    //查询所有应聘人申请信息
    public List<Applicant> selectApplicants();

//查询身份证唯一性
    public int selectCarid(String carid);

//根据岗位编号查应聘者
    public List<Applicant> selectDeptApplicants(int postid);

    List<HashMap> selectApplicantsBystate();

    int updateApplicantstatus(@Param("applicantid")int applicantid);
}
