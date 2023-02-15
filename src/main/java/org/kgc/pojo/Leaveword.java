package org.kgc.pojo;


public class Leaveword {

  private Integer lwid;
  private String lwname;
  private String lwphone;
  private String lwemail;
  private String leaveword;
  private Integer caseid;

  public Leaveword(Integer lwid, String lwname, String lwphone, String lwemail, String leaveword, Integer caseid) {
    this.lwid = lwid;
    this.lwname = lwname;
    this.lwphone = lwphone;
    this.lwemail = lwemail;
    this.leaveword = leaveword;
    this.caseid = caseid;
  }

  public Leaveword() {
  }

  public Integer getCaseid() {
    return caseid;
  }

  public void setCaseid(Integer caseid) {
    this.caseid = caseid;
  }

  public Integer getLwid() {
    return lwid;
  }

  public void setLwid(Integer lwid) {
    this.lwid = lwid;
  }


  public String getLwname() {
    return lwname;
  }

  public void setLwname(String lwname) {
    this.lwname = lwname;
  }


  public String getLwphone() {
    return lwphone;
  }

  public void setLwphone(String lwphone) {
    this.lwphone = lwphone;
  }


  public String getLwemail() {
    return lwemail;
  }

  public void setLwemail(String lwemail) {
    this.lwemail = lwemail;
  }


  public String getLeaveword() {
    return leaveword;
  }

  public void setLeaveword(String leaveword) {
    this.leaveword = leaveword;
  }

}
