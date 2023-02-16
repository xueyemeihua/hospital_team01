package org.kgc.pojo;


//病例类(前端用)
public class Case {
    private Integer caseid;
    private String stafname;
    private String regdesc;
    private String diagnosis;
    private String curescheme;
    private Integer casestate;
    private String curetime;
    private Integer regfee;

    @Override
    public String toString() {
        return "Case{" +
                "caseid=" + caseid +
                ", stafname='" + stafname + '\'' +
                ", regdesc='" + regdesc + '\'' +
                ", diagnosis='" + diagnosis + '\'' +
                ", curescheme='" + curescheme + '\'' +
                ", casestate=" + casestate +
                ", curetime='" + curetime + '\'' +
                ", regfee=" + regfee +
                '}';
    }

    public Integer getCaseid() {

        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public String getStafname() {
        return stafname;
    }

    public void setStafname(String stafname) {
        this.stafname = stafname;
    }

    public String getRegdesc() {
        return regdesc;
    }

    public void setRegdesc(String regdesc) {
        this.regdesc = regdesc;
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

    public Integer getCasestate() {
        return casestate;
    }

    public void setCasestate(Integer casestate) {
        this.casestate = casestate;
    }

    public String getCuretime() {
        return curetime;
    }

    public void setCuretime(String curetime) {
        this.curetime = curetime;
    }

    public Integer getRegfee() {
        return regfee;
    }

    public void setRegfee(Integer regfee) {
        this.regfee = regfee;
    }

    public Case() {
    }

    public Case(Integer caseid, String stafname, String regdesc, String diagnosis, String curescheme, Integer casestate, String curetime, Integer regfee) {
        this.caseid = caseid;
        this.stafname = stafname;
        this.regdesc = regdesc;
        this.diagnosis = diagnosis;
        this.curescheme = curescheme;
        this.casestate = casestate;
        this.curetime = curetime;
        this.regfee = regfee;
    }

    //逻辑视图
    public String getCasestateStr(){
        if (casestate == null){
            return "未知";
        }
        return casestate == 0 ? "未接诊":"已接诊";
    }

}
