package org.kgc.pojo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-20-12:04
 */
public class SickerRegResult {
    private int regid;
    private String regdate;
    private String regdesc;
    private int regfee;
    private int sickid;
    private String sickname;
    private String sickphone;
    private String sickcard;
    private String sickuname;
    private String sickemail;

    @Override
    public String toString() {
        return "SickerRegResult{" +
                "regid=" + regid +
                ", regdate='" + regdate + '\'' +
                ", regdesc='" + regdesc + '\'' +
                ", regfee=" + regfee +
                ", sickid=" + sickid +
                ", sickname='" + sickname + '\'' +
                ", sickphone='" + sickphone + '\'' +
                ", sickcard='" + sickcard + '\'' +
                ", sickuname='" + sickuname + '\'' +
                ", sickemail='" + sickemail + '\'' +
                '}';
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public String getRegdesc() {
        return regdesc;
    }

    public void setRegdesc(String regdesc) {
        this.regdesc = regdesc;
    }

    public int getRegfee() {
        return regfee;
    }

    public void setRegfee(int regfee) {
        this.regfee = regfee;
    }

    public int getSickid() {
        return sickid;
    }

    public void setSickid(int sickid) {
        this.sickid = sickid;
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

    public String getSickcard() {
        return sickcard;
    }

    public void setSickcard(String sickcard) {
        this.sickcard = sickcard;
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

    public int getRegid() {
        return regid;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public SickerRegResult(int regid, String regdate, String regdesc, int regfee, int sickid, String sickname, String sickphone, String sickcard, String sickuname, String sickemail) {
        this.regid = regid;
        this.regdate = regdate;
        this.regdesc = regdesc;
        this.regfee = regfee;
        this.sickid = sickid;
        this.sickname = sickname;
        this.sickphone = sickphone;
        this.sickcard = sickcard;
        this.sickuname = sickuname;
        this.sickemail = sickemail;
    }

    public SickerRegResult() {
    }
}
