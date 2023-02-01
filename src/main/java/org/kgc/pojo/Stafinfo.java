package org.kgc.pojo;

public class Stafinfo {
  private Integer stafid;
  private Integer postid;
  private Integer mgr;
  private Integer deptid;
  private String stafcard;
  private String stafname;
  private Integer rankid;
  private String stafintro;
  private Integer stafstate;
  private String stafphone;
  private String username;
  private String email;
  private String password;

  public Stafinfo() {
  }

  public Stafinfo(Integer stafid, Integer postid, Integer mgr, Integer deptid, String stafcard, String stafname, Integer rankid, String stafintro, Integer stafstate, String stafphone, String username, String email, String password) {
    this.stafid = stafid;
    this.postid = postid;
    this.mgr = mgr;
    this.deptid = deptid;
    this.stafcard = stafcard;
    this.stafname = stafname;
    this.rankid = rankid;
    this.stafintro = stafintro;
    this.stafstate = stafstate;
    this.stafphone = stafphone;
    this.username = username;
    this.email = email;
    this.password = password;
  }

  /**
   * 获取
   * @return stafid
   */
  public Integer getStafid() {
    return stafid;
  }

  /**
   * 设置
   * @param stafid
   */
  public void setStafid(Integer stafid) {
    this.stafid = stafid;
  }

  /**
   * 获取
   * @return postid
   */
  public Integer getPostid() {
    return postid;
  }

  /**
   * 设置
   * @param postid
   */
  public void setPostid(Integer postid) {
    this.postid = postid;
  }

  /**
   * 获取
   * @return mgr
   */
  public Integer getMgr() {
    return mgr;
  }

  /**
   * 设置
   * @param mgr
   */
  public void setMgr(Integer mgr) {
    this.mgr = mgr;
  }

  /**
   * 获取
   * @return deptid
   */
  public Integer getDeptid() {
    return deptid;
  }

  /**
   * 设置
   * @param deptid
   */
  public void setDeptid(Integer deptid) {
    this.deptid = deptid;
  }

  /**
   * 获取
   * @return stafcard
   */
  public String getStafcard() {
    return stafcard;
  }

  /**
   * 设置
   * @param stafcard
   */
  public void setStafcard(String stafcard) {
    this.stafcard = stafcard;
  }

  /**
   * 获取
   * @return stafname
   */
  public String getStafname() {
    return stafname;
  }

  /**
   * 设置
   * @param stafname
   */
  public void setStafname(String stafname) {
    this.stafname = stafname;
  }

  /**
   * 获取
   * @return rankid
   */
  public Integer getRankid() {
    return rankid;
  }

  /**
   * 设置
   * @param rankid
   */
  public void setRankid(Integer rankid) {
    this.rankid = rankid;
  }

  /**
   * 获取
   * @return stafintro
   */
  public String getStafintro() {
    return stafintro;
  }

  /**
   * 设置
   * @param stafintro
   */
  public void setStafintro(String stafintro) {
    this.stafintro = stafintro;
  }

  /**
   * 获取
   * @return stafstate
   */
  public Integer getStafstate() {
    return stafstate;
  }

  /**
   * 设置
   * @param stafstate
   */
  public void setStafstate(Integer stafstate) {
    this.stafstate = stafstate;
  }

  /**
   * 获取
   * @return stafphone
   */
  public String getStafphone() {
    return stafphone;
  }

  /**
   * 设置
   * @param stafphone
   */
  public void setStafphone(String stafphone) {
    this.stafphone = stafphone;
  }

  /**
   * 获取
   * @return username
   */
  public String getUsername() {
    return username;
  }

  /**
   * 设置
   * @param username
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * 获取
   * @return email
   */
  public String getEmail() {
    return email;
  }

  /**
   * 设置
   * @param email
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * 获取
   * @return password
   */
  public String getPassword() {
    return password;
  }

  /**
   * 设置
   * @param password
   */
  public void setPassword(String password) {
    this.password = password;
  }

  public String toString() {
    return "Stafinfo{stafid = " + stafid + ", postid = " + postid + ", mgr = " + mgr + ", deptid = " + deptid + ", stafcard = " + stafcard + ", stafname = " + stafname + ", rankid = " + rankid + ", stafintro = " + stafintro + ", stafstate = " + stafstate + ", stafphone = " + stafphone + ", username = " + username + ", email = " + email + ", password = " + password + "}";
  }
}
