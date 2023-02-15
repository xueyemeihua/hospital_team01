package org.kgc.pojo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-12-14:17
 */
public class CaseResult {
    private int caseid;
    private String sickname;
    private String deptname;
    private String stafname;
    private String diagnosis;
    private String curescheme;
    private String curetime;
    private String casestate;

    @Override
    public String toString() {
        return "CaseResult{" +
                "caseid=" + caseid +
                ", sickname='" + sickname + '\'' +
                ", deptname='" + deptname + '\'' +
                ", stafname='" + stafname + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", curescheme='" + curescheme + '\'' +
                ", curetime='" + curetime + '\'' +
                ", casestate='" + casestate + '\'' +
                '}';
    }

    public int getCaseid() {
        return caseid;
    }

    public void setCaseid(int caseid) {
        this.caseid = caseid;
    }

    public String getSickname() {
        return sickname;
    }

    public void setSickname(String sickname) {
        this.sickname = sickname;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getStafname() {
        return stafname;
    }

    public void setStafname(String stafname) {
        this.stafname = stafname;
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

    public String getCasestate() {
        return casestate;
    }

    public void setCasestate(String casestate) {
        this.casestate = casestate;
    }

    public CaseResult(int caseid, String sickname, String deptname, String stafname, String diagnosis, String curescheme, String curetime, String casestate) {
        this.caseid = caseid;
        this.sickname = sickname;
        this.deptname = deptname;
        this.stafname = stafname;
        this.diagnosis = diagnosis;
        this.curescheme = curescheme;
        this.curetime = curetime;
        this.casestate = casestate;
    }

    public CaseResult() {
    }
}
