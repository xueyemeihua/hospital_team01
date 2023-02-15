package org.kgc.pojo;

public class Applicant {
    //应聘者信息
    private int applicantId;
    private String applicantName;
    private String applicantSex;
    private String applicantCarid;
    private String applicantPhone;
    private String email;
    private String deptname;
    private int applicantAge;
    private int salary;
    private String myself;
    private String agowork;
    private int deptid;
    private int postid;
    private String postname;
    private int applicantstatus;

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantId=" + applicantId +
                ", applicantName='" + applicantName + '\'' +
                ", applicantSex='" + applicantSex + '\'' +
                ", applicantCarid='" + applicantCarid + '\'' +
                ", applicantPhone='" + applicantPhone + '\'' +
                ", email='" + email + '\'' +
                ", deptname='" + deptname + '\'' +
                ", applicantAge=" + applicantAge +
                ", salary=" + salary +
                ", myself='" + myself + '\'' +
                ", agowork='" + agowork + '\'' +
                ", deptid=" + deptid +
                ", postid=" + postid +
                ", postname='" + postname + '\'' +
                ", applicantstatus=" + applicantstatus +
                '}';
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getApplicantSex() {
        return applicantSex;
    }

    public void setApplicantSex(String applicantSex) {
        this.applicantSex = applicantSex;
    }

    public String getApplicantCarid() {
        return applicantCarid;
    }

    public void setApplicantCarid(String applicantCarid) {
        this.applicantCarid = applicantCarid;
    }

    public String getApplicantPhone() {
        return applicantPhone;
    }

    public void setApplicantPhone(String applicantPhone) {
        this.applicantPhone = applicantPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getApplicantAge() {
        return applicantAge;
    }

    public void setApplicantAge(int applicantAge) {
        this.applicantAge = applicantAge;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getMyself() {
        return myself;
    }

    public void setMyself(String myself) {
        this.myself = myself;
    }

    public String getAgowork() {
        return agowork;
    }

    public void setAgowork(String agowork) {
        this.agowork = agowork;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public int getPostid() {
        return postid;
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public int getApplicantstatus() {
        return applicantstatus;
    }

    public void setApplicantstatus(int applicantstatus) {
        this.applicantstatus = applicantstatus;
    }

    public Applicant(int applicantId, String applicantName, String applicantSex, String applicantCarid, String applicantPhone, String email, String deptname, int applicantAge, int salary, String myself, String agowork, int deptid, int postid, String postname, int applicantstatus) {
        this.applicantId = applicantId;
        this.applicantName = applicantName;
        this.applicantSex = applicantSex;
        this.applicantCarid = applicantCarid;
        this.applicantPhone = applicantPhone;
        this.email = email;
        this.deptname = deptname;
        this.applicantAge = applicantAge;
        this.salary = salary;
        this.myself = myself;
        this.agowork = agowork;
        this.deptid = deptid;
        this.postid = postid;
        this.postname = postname;
        this.applicantstatus = applicantstatus;
    }

    public Applicant() {
    }
}