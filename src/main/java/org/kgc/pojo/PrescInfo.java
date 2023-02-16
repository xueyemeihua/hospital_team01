package org.kgc.pojo;

public class PrescInfo {
    private int prescid;        //处方单编号
    private int drugid;         //药品编号
    private int caseid;         //病例编号
    private int drugcount;      //药品数量
    private int prescstate;     //抓药状态（0未抓药，1已抓药）

    public PrescInfo(int prescid, int drugid, int caseid, int drugcount, int prescstate) {
        this.prescid = prescid;
        this.drugid = drugid;
        this.caseid = caseid;
        this.drugcount = drugcount;
        this.prescstate = prescstate;
    }

    public PrescInfo() {
    }

    public int getPrescid() {
        return prescid;
    }

    public void setPrescid(int prescid) {
        this.prescid = prescid;
    }

    public int getDrugid() {
        return drugid;
    }

    public void setDrugid(int drugid) {
        this.drugid = drugid;
    }

    public int getCaseid() {
        return caseid;
    }

    public void setCaseid(int caseid) {
        this.caseid = caseid;
    }

    public int getDrugcount() {
        return drugcount;
    }

    public void setDrugcount(int drugcount) {
        this.drugcount = drugcount;
    }

    public int getPrescstate() {
        return prescstate;
    }

    public void setPrescstate(int prescstate) {
        this.prescstate = prescstate;
    }

    @Override
    public String toString() {
        return "PrescInfo{" +
                "prescid=" + prescid +
                ", drugid=" + drugid +
                ", caseid=" + caseid +
                ", drugcount=" + drugcount +
                ", prescstate=" + prescstate +
                '}';
    }
}
