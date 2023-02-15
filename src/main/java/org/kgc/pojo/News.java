package org.kgc.pojo;


import java.sql.Date;

public class News {

  private int newsid;
  private String newstitle;
  private String newsdate;
  private String newscont;
  private int newsstate;

  public News(int newsid, String newstitle, String newsdate, String newscont) {
    this.newsid = newsid;
    this.newstitle = newstitle;
    this.newsdate = newsdate;
    this.newscont = newscont;
  }

  public News(String newstitle, String newsdate, String newscont) {
    this.newstitle = newstitle;
    this.newsdate = newsdate;
    this.newscont = newscont;
  }

  @Override
  public String toString() {
    return "News{" +
            "newsid=" + newsid +
            ", newstitle='" + newstitle + '\'' +
            ", newsdate=" + newsdate +
            ", newscont='" + newscont + '\'' +
            ", newsstate=" + newsstate +
            '}';
  }

  public String getNewstitle() {
    return newstitle;
  }

  public void setNewstitle(String newstitle) {
    this.newstitle = newstitle;
  }


  public String getNewsdate() {
    return newsdate;
  }

  public void setNewsdate(String newsdate) {
    this.newsdate = newsdate;
  }


  public String getNewscont() {
    return newscont;
  }

  public void setNewscont(String newscont) {
    this.newscont = newscont;
  }

  public int getNewsid() {
    return newsid;
  }

  public void setNewsid(int newsid) {
    this.newsid = newsid;
  }

  public int getNewsstate() {
    return newsstate;
  }

  public void setNewsstate(int newsstate) {
    this.newsstate = newsstate;
  }

  public News(int newsid, String newstitle, String newsdate, String newscont, int newsstate) {
    this.newsid = newsid;
    this.newstitle = newstitle;
    this.newsdate = newsdate;
    this.newscont = newscont;
    this.newsstate = newsstate;
  }

  public News() {
  }
}
