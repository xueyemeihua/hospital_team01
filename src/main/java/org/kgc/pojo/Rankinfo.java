package org.kgc.pojo;


public class Rankinfo {

  private Integer rankid;
  private String rankname;
  private double regfeeid;

  public Rankinfo(Integer rankid, String rankname, double regfeeid) {
    this.rankid = rankid;
    this.rankname = rankname;
    this.regfeeid = regfeeid;
  }

  public Rankinfo() {
  }

  public Integer getRankid() {
    return rankid;
  }

  public void setRankid(Integer rankid) {
    this.rankid = rankid;
  }


  public String getRankname() {
    return rankname;
  }

  public void setRankname(String rankname) {
    this.rankname = rankname;
  }


  public double getRegfeeid() {
    return regfeeid;
  }

  public void setRegfeeid(double regfeeid) {
    this.regfeeid = regfeeid;
  }

}
