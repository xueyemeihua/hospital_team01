package org.kgc.pojo;


public class Sickerinfo {

  private long sickid;
  private String sickcard;
  private String sickname;
  private String sickphone;
  private String sickpwd;
  private String sickuname;
  private String sickemail;

  public Sickerinfo() {
  }

  public Sickerinfo(String sickcard, String sickphone, String sickpwd, String sickuname, String sickemail) {
    this.sickcard = sickcard;
    this.sickphone = sickphone;
    this.sickpwd = sickpwd;
    this.sickuname = sickuname;
    this.sickemail = sickemail;
  }

  public Sickerinfo(long sickid, String sickcard, String sickname, String sickphone, String sickpwd, String sickuname, String sickemail) {
    this.sickid = sickid;
    this.sickcard = sickcard;
    this.sickname = sickname;
    this.sickphone = sickphone;
    this.sickpwd = sickpwd;
    this.sickuname = sickuname;
    this.sickemail = sickemail;
  }

  public long getSickid() {
    return sickid;
  }

  public void setSickid(long sickid) {
    this.sickid = sickid;
  }


  public String getSickcard() {
    return sickcard;
  }

  public void setSickcard(String sickcard) {
    this.sickcard = sickcard;
  }


  public String getSickname() {
    return sickname;
  }

  public void setSickname(String sickname) {
    this.sickname = sickname;
  }


  public String getSickphone() {
    return sickphone;
  }

  public void setSickphone(String sickphone) {
    this.sickphone = sickphone;
  }


  public String getSickpwd() {
    return sickpwd;
  }

  public void setSickpwd(String sickpwd) {
    this.sickpwd = sickpwd;
  }


  public String getSickuname() {
    return sickuname;
  }

  public void setSickuname(String sickuname) {
    this.sickuname = sickuname;
  }


  public String getSickemail() {
    return sickemail;
  }

  public void setSickemail(String sickemail) {
    this.sickemail = sickemail;
  }

}