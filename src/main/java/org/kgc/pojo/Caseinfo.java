package org.kgc.pojo;


public class Caseinfo {

  private int caseid;
  private String diagnosis;
  private String curescheme;
  private java.sql.Timestamp curetime;
  private int sickid;
  private int casestate;


  public int getCaseid() {
    return caseid;
  }

  public void setCaseid(int caseid) {
    this.caseid = caseid;
  }


  public String getDiagnosis() {
    return diagnosis;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }


  public String getCurescheme() {
    return curescheme;
  }

  public void setCurescheme(String curescheme) {
    this.curescheme = curescheme;
  }


  public java.sql.Timestamp getCuretime() {
    return curetime;
  }

  public void setCuretime(java.sql.Timestamp curetime) {
    this.curetime = curetime;
  }


  public int getSickid() {
    return sickid;
  }

  public void setSickid(int sickid) {
    this.sickid = sickid;
  }


  public int getCasestate() {
    return casestate;
  }

  public void setCasestate(int casestate) {
    this.casestate = casestate;
  }

}
