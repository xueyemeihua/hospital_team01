package org.kgc.pojo;


public class CaseInfo {
    private Integer caseid;
    private String diagnosis;
    private String curescheme;
    private String curetime;
    private Integer sickid;
    private Integer stafid;
    private Integer casestate;
    private Integer regid;

    @Override
    public String toString() {
        return "CaseInfo{" +
                "caseid=" + caseid +
                ", diagnosis='" + diagnosis + '\'' +
                ", curescheme='" + curescheme + '\'' +
                ", curetime='" + curetime + '\'' +
                ", sickid=" + sickid +
                ", stafid=" + stafid +
                ", casestate=" + casestate +
                ", regid=" + regid +
                '}';
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public String getCurescheme() {
        return curescheme;
    }

    public void setCurescheme(String curescheme) {
        this.curescheme = curescheme;
    }

    public String getCuretime() {
        return curetime;
    }

    public void setCuretime(String curetime) {
        this.curetime = curetime;
    }

    public Integer getSickid() {
        return sickid;
    }

    public void setSickid(Integer sickid) {
        this.sickid = sickid;
    }

    public Integer getStafid() {
        return stafid;
    }

    public void setStafid(Integer stafid) {
        this.stafid = stafid;
    }

    public Integer getCasestate() {
        return casestate;
    }

    public void setCasestate(Integer casestate) {
        this.casestate = casestate;
    }

    public Integer getRegid() {
        return regid;
    }

    public void setRegid(Integer regid) {
        this.regid = regid;
    }

    public CaseInfo() {
    }

    public CaseInfo(Integer caseid, String diagnosis, String curescheme, String curetime, Integer sickid, Integer stafid, Integer casestate, Integer regid) {
        this.caseid = caseid;
        this.diagnosis = diagnosis;
        this.curescheme = curescheme;
        this.curetime = curetime;
        this.sickid = sickid;
        this.stafid = stafid;
        this.casestate = casestate;
        this.regid = regid;
    }

    //逻辑视图
    public String getCasestateStr(){
        if (casestate == null){
            return "未知";
        }
        return casestate == 0 ? "未接诊":"已接诊";
    }

}
