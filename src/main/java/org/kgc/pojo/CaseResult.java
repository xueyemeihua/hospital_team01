package org.kgc.pojo;

import java.awt.print.PrinterGraphics;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-12-14:17
 */
public class CaseResult {
    private Integer caseid;
    private String sickname;
    private String deptname;
    private Integer stafid;
    private String stafname;
    private String diagnosis;
    private String curescheme;
    private String curetime;
    private Integer casestate;
    private String regdate;
    private String regdesc;
    private Double regfee;

    @Override
    public String toString() {
        return "CaseResult{" +
                "caseid=" + caseid +
                ", sickname='" + sickname + '\'' +
                ", deptname='" + deptname + '\'' +
                ", stafid=" + stafid +
                ", stafname='" + stafname + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", curescheme='" + curescheme + '\'' +
                ", curetime='" + curetime + '\'' +
                ", casestate=" + casestate +
                ", regdate='" + regdate + '\'' +
                ", regdesc='" + regdesc + '\'' +
                ", regfee=" + regfee +
                '}';
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
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

    public Integer getStafid() {
        return stafid;
    }

    public void setStafid(Integer stafid) {
        this.stafid = stafid;
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

    public Integer getCasestate() {
        return casestate;
    }

    public void setCasestate(Integer casestate) {
        this.casestate = casestate;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getRegdesc() {
        return regdesc;
    }

    public void setRegdesc(String regdesc) {
        this.regdesc = regdesc;
    }

    public Double getRegfee() {
        return regfee;
    }

    public void setRegfee(Double regfee) {
        this.regfee = regfee;
    }

    public CaseResult(Integer caseid, String sickname, String deptname, Integer stafid, String stafname, String diagnosis, String curescheme, String curetime, Integer casestate, String regdate, String regdesc, Double regfee) {
        this.caseid = caseid;
        this.sickname = sickname;
        this.deptname = deptname;
        this.stafid = stafid;
        this.stafname = stafname;
        this.diagnosis = diagnosis;
        this.curescheme = curescheme;
        this.curetime = curetime;
        this.casestate = casestate;
        this.regdate = regdate;
        this.regdesc = regdesc;
        this.regfee = regfee;
    }

    public CaseResult() {
    }
}
