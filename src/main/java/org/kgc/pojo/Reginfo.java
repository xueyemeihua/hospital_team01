package org.kgc.pojo;




public class Reginfo {

  private Integer regid;
  private Integer deptid;
  private String date;
  private Integer regfeeid;
  private Integer sickid;
  private Integer stafid;
  private Integer regstate;

  @Override
  public String toString() {
    return "Reginfo{" +
            "regid=" + regid +
            ", deptid=" + deptid +
            ", date='" + date + '\'' +
            ", regfeeid=" + regfeeid +
            ", sickid=" + sickid +
            ", stafid=" + stafid +
            ", regstate=" + regstate +
            '}';
  }

  public Integer getRegid() {
    return regid;
  }

  public void setRegid(Integer regid) {
    this.regid = regid;
  }

  public Integer getDeptid() {
    return deptid;
  }

  public void setDeptid(Integer deptid) {
    this.deptid = deptid;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Integer getRegfeeid() {
    return regfeeid;
  }

  public void setRegfeeid(Integer regfeeid) {
    this.regfeeid = regfeeid;
  }

  public Integer getSickid() {
    return sickid;
  }

  public void setSickid(Integer sickid) {
    this.sickid = sickid;
  }

  public Integer getStafid() {
    return stafid;
  }

  public void setStafid(Integer stafid) {
    this.stafid = stafid;
  }

  public Integer getRegstate() {
    return regstate;
  }

  public void setRegstate(Integer regstate) {
    this.regstate = regstate;
  }

  public Reginfo() {
  }

  public Reginfo(Integer regid, Integer deptid, String date, Integer regfeeid, Integer sickid, Integer stafid, Integer regstate) {
    this.regid = regid;
    this.deptid = deptid;
    this.date = date;
    this.regfeeid = regfeeid;
    this.sickid = sickid;
    this.stafid = stafid;
    this.regstate = regstate;
  }
}
