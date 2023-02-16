package org.kgc.pojo;


public class Rankinfo {

  private Integer rankid;
  private String rankname;
  private int regfeeid;

  @Override
  public String toString() {
    return "Rankinfo{" +
            "rankid=" + rankid +
            ", rankname='" + rankname + '\'' +
            ", regfeeid=" + regfeeid +
            '}';
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

  public int getRegfeeid() {
    return regfeeid;
  }

  public void setRegfeeid(int regfeeid) {
    this.regfeeid = regfeeid;
  }

  public Rankinfo() {
  }

  public Rankinfo(Integer rankid, String rankname, int regfeeid) {
    this.rankid = rankid;
    this.rankname = rankname;
    this.regfeeid = regfeeid;
  }
}
