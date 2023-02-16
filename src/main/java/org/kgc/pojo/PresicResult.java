package org.kgc.pojo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-12-15:43
 */
public class PresicResult {
    private Integer caseid;
    private Integer sickid;
    private String sickname;
    private Integer prescid;
    private String drugname;
    private Integer drugcount;
    private Double drugprice;
    private String drugspeci;
    private Integer prescstate;

    public PresicResult() {
    }

    public PresicResult(Integer caseid, Integer sickid, String sickname, Integer prescid, String drugname, Integer drugcount, Double drugprice, String drugspeci, Integer prescstate) {
        this.caseid = caseid;
        this.sickid = sickid;
        this.sickname = sickname;
        this.prescid = prescid;
        this.drugname = drugname;
        this.drugcount = drugcount;
        this.drugprice = drugprice;
        this.drugspeci = drugspeci;
        this.prescstate = prescstate;
    }

    public String getSickname() {
        return sickname;
    }

    public void setSickname(String sickname) {
        this.sickname = sickname;
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

    public Integer getDrugcount() {
        return drugcount;
    }

    public void setDrugcount(Integer drugcount) {
        this.drugcount = drugcount;
    }

    public Double getDrugprice() {
        return drugprice;
    }

    public void setDrugprice(Double drugprice) {
        this.drugprice = drugprice;
    }

    public String getDrugspeci() {
        return drugspeci;
    }

    public void setDrugspeci(String drugspeci) {
        this.drugspeci = drugspeci;
    }

    public Integer getPrescstate() {
        return prescstate;
    }

    public void setPrescstate(Integer prescstate) {
        this.prescstate = prescstate;
    }

    public Integer getCaseid() {
        return caseid;
    }

    public void setCaseid(Integer caseid) {
        this.caseid = caseid;
    }

    @Override
    public String toString() {
        return "PresicResult{" +
                "caseid=" + caseid +
                ", sickid=" + sickid +
                ", sickname='" + sickname + '\'' +
                ", prescid=" + prescid +
                ", drugname='" + drugname + '\'' +
                ", drugcount=" + drugcount +
                ", drugprice=" + drugprice +
                ", drugspeci='" + drugspeci + '\'' +
                ", prescstate=" + prescstate +
                '}';
    }
}
