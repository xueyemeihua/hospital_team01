package org.kgc.pojo;


public class Druginfo {

  private Integer drugid;
  private String drugname;
  private Integer druginven;
  private double drugprice;
  private Integer drugindate;
  private java.sql.Timestamp drugprodate;
  private String drugfac;
  private String facphone;
  private String drugfunc;
  private String drugspeci;


  public Integer getDrugid() {
    return drugid;
  }

  public void setDrugid(Integer drugid) {
    this.drugid = drugid;
  }


  public String getDrugname() {
    return drugname;
  }

  public void setDrugname(String drugname) {
    this.drugname = drugname;
  }


  public Integer getDruginven() {
    return druginven;
  }

  public void setDruginven(Integer druginven) {
    this.druginven = druginven;
  }


  public double getDrugprice() {
    return drugprice;
  }

  public void setDrugprice(double drugprice) {
    this.drugprice = drugprice;
  }


  public Integer getDrugindate() {
    return drugindate;
  }

  public void setDrugindate(Integer drugindate) {
    this.drugindate = drugindate;
  }


  public java.sql.Timestamp getDrugprodate() {
    return drugprodate;
  }

  public void setDrugprodate(java.sql.Timestamp drugprodate) {
    this.drugprodate = drugprodate;
  }


  public String getDrugfac() {
    return drugfac;
  }

  public void setDrugfac(String drugfac) {
    this.drugfac = drugfac;
  }


  public String getFacphone() {
    return facphone;
  }

  public void setFacphone(String facphone) {
    this.facphone = facphone;
  }


  public String getDrugfunc() {
    return drugfunc;
  }

  public void setDrugfunc(String drugfunc) {
    this.drugfunc = drugfunc;
  }


  public String getDrugspeci() {
    return drugspeci;
  }

  public void setDrugspeci(String drugspeci) {
    this.drugspeci = drugspeci;
  }

}
