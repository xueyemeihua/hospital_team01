package org.kgc.pojo;


import java.sql.Timestamp;

public class Reginfo {

  private Integer regid;
  private Integer deptid;
  private java.sql.Timestamp regdate;
  private Integer regfeeid;
  private Integer sickid;
  private Integer stafid;
  private Integer regstate;

  public Reginfo(Integer regid, Integer deptid, Timestamp regdate, Integer regfeeid, Integer sickid, Integer stafid, Integer regstate) {
    this.regid = regid;
    this.deptid = deptid;
    this.regdate = regdate;
    this.regfeeid = regfeeid;
    this.sickid = sickid;
    this.stafid = stafid;
    this.regstate = regstate;
  }

  public Reginfo() {
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


  public java.sql.Timestamp getRegdate() {
    return regdate;
  }

  public void setRegdate(java.sql.Timestamp regdate) {
    this.regdate = regdate;
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

}
