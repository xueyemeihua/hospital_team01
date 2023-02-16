package org.kgc.pojo;



public class Prescription {
    private Integer prescid;
    private String  drugname;
    private Integer drugcount;
    private Double drugprice;
    private Double drugSubtotal;
    private String drugspeci;
    private Integer prescstate;


    @Override
    public String toString() {
        return "Prescription{" +
                "prescid=" + prescid +
                ", drugname='" + drugname + '\'' +
                ", drugcount=" + drugcount +
                ", drugprice=" + drugprice +
                ", drugSubtotal=" + drugSubtotal +
                ", drugspeci='" + drugspeci + '\'' +
                ", prescstate=" + prescstate +
                '}';
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

    public void setDrugSubtotal(Double drugSubtotal) {
        this.drugSubtotal = drugSubtotal;
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

    public Prescription() {
    }

    public Prescription(Integer prescid, String drugname, Integer drugcount, Double drugprice, Double drugSubtotal, String drugspeci, Integer prescstate) {
        this.prescid = prescid;
        this.drugname = drugname;
        this.drugcount = drugcount;
        this.drugprice = drugprice;
        this.drugSubtotal = drugSubtotal;
        this.drugspeci = drugspeci;
        this.prescstate = prescstate;
    }

    public Double getDrugSubtotal() {
        return drugprice*drugcount;
    }

    //逻辑视图
    public String getPrescstateStr(){
        if (prescstate == null){
            return "未知";
        }
        return prescstate == 0 ? "未抓药":"已抓药";
    }

}
