package org.kgc.pojo;


public class Prescinfo {

  private int prescid;
  private int drugid;
  private int caseid;
  private int drugcount;
  private int prescstate;
  private String catchtime;

  @Override
  public String toString() {
    return "Prescinfo{" +
            "prescid=" + prescid +
            ", drugid=" + drugid +
            ", caseid=" + caseid +
            ", drugcount=" + drugcount +
            ", prescstate=" + prescstate +
            ", catchtime='" + catchtime + '\'' +
            '}';
  }

  public Prescinfo() {
  }

  public Prescinfo(int prescid, int drugid, int caseid, int drugcount, int prescstate, String catchtime) {
    this.prescid = prescid;
    this.drugid = drugid;
    this.caseid = caseid;
    this.drugcount = drugcount;
    this.prescstate = prescstate;
    this.catchtime = catchtime;
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


  public String getCatchtime() {
    return catchtime;
  }

  public void setCatchtime(String catchtime) {
    this.catchtime = catchtime;
  }

}
