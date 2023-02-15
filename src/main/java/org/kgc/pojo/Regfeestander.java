package org.kgc.pojo;


public class Regfeestander {

  private Integer regfeeid;
  private String regdesc;
  private double regfee;
  private Integer rankid;

  public Regfeestander(Integer regfeeid, String regdesc, double regfee, Integer rankid) {
    this.regfeeid = regfeeid;
    this.regdesc = regdesc;
    this.regfee = regfee;
    this.rankid = rankid;
  }

  public Regfeestander() {
  }

  public Integer getRegfeeid() {
    return regfeeid;
  }

  public void setRegfeeid(Integer regfeeid) {
    this.regfeeid = regfeeid;
  }


  public String getRegdesc() {
    return regdesc;
  }

  public void setRegdesc(String regdesc) {
    this.regdesc = regdesc;
  }


  public double getRegfee() {
    return regfee;
  }

  public void setRegfee(double regfee) {
    this.regfee = regfee;
  }


  public Integer getRankid() {
    return rankid;
  }

  public void setRankid(Integer rankid) {
    this.rankid = rankid;
  }

}
