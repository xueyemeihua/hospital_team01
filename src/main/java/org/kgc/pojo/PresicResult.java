package org.kgc.pojo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-12-15:43
 */
public class PresicResult {
    private Integer caseid;
    private Integer sickid;
    private Integer prescid;
    private String drugname;
    private Integer druginven;
    private Integer drugcount;
    private String drugspeci;
    private Integer prescstate;

    public PresicResult() {
    }

    public PresicResult(Integer caseid, Integer sickid, Integer prescid, String drugname, Integer druginven, Integer drugcount, String drugspeci, Integer prescstate) {
        this.caseid = caseid;
        this.sickid = sickid;
        this.prescid = prescid;
        this.drugname = drugname;
        this.druginven = druginven;
        this.drugcount = drugcount;
        this.drugspeci = drugspeci;
        this.prescstate = prescstate;
    }

    public String getDrugspeci() {
        return drugspeci;
    }

    public void setDrugspeci(String drugspeci) {
        this.drugspeci = drugspeci;
    }

    @Override
    public String toString() {
        return "PresicResult{" +
                "caseid=" + caseid +
                ", sickid=" + sickid +
                ", prescid=" + prescid +
                ", drugname='" + drugname + '\'' +
                ", druginven=" + druginven +
                ", drugcount=" + drugcount +
                ", prescstate=" + prescstate +
                '}';
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    public Integer getSickid() {
        return sickid;
    }

    public void setSickid(Integer sickid) {
        this.sickid = sickid;
    }

    public Integer getPrescid() {
        return prescid;
    }

    public void setPrescid(Integer prescid) {
        this.prescid = prescid;
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public Integer getDruginven() {
        return druginven;
    }

    public void setDruginven(Integer druginven) {
        this.druginven = druginven;
    }

    public Integer getDrugcount() {
        return drugcount;
    }

    public void setDrugcount(Integer drugcount) {
        this.drugcount = drugcount;
    }

    public Integer getPrescstate() {
        return prescstate;
    }

    public void setPrescstate(Integer prescstate) {
        this.prescstate = prescstate;
    }
}
