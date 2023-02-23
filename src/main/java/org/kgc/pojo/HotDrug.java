package org.kgc.pojo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-17:00
 */
public class HotDrug {
    private String drugname;
    private int drugnum;
    private int index;

    @Override
    public String toString() {
        return "HotDrug{" +
                "drugname='" + drugname + '\'' +
                ", drugnum=" + drugnum +
                ", index=" + index +
                '}';
    }

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public int getDrugnum() {
        return drugnum;
    }

    public void setDrugnum(int drugnum) {
        this.drugnum = drugnum;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public HotDrug() {
    }

    public HotDrug(String drugname, int drugnum, int index) {
        this.drugname = drugname;
        this.drugnum = drugnum;
        this.index = index;
    }
}
