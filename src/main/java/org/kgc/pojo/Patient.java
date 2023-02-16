package org.kgc.pojo;


import org.kgc.utils.IDCardUtil;

public class Patient {
    private Integer sickid;
    private String sickname;
    private String sickcard;
    private String sickphone;
    private String sex;
    private Integer age;
    private String regdate;
    private String sickuname;
    private String sickemail;
    private Integer regid;


    public String getSex() {
        return IDCardUtil.getGenderByIdCard(sickcard);
    }

    public Integer getAge() {
        return IDCardUtil.getAgeByIdCard(sickcard);
    }

    public Patient() {
    }

    @Override
    public String toString() {
        return "Patient{" +
                "sickid=" + sickid +
                ", sickname='" + sickname + '\'' +
                ", sickcard='" + sickcard + '\'' +
                ", sickphone='" + sickphone + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", regdate='" + regdate + '\'' +
                ", sickuname='" + sickuname + '\'' +
                ", sickemail='" + sickemail + '\'' +
                ", regid=" + regid +
                '}';
    }

    public Integer getSickid() {
        return sickid;
    }

    public void setSickid(Integer sickid) {
        this.sickid = sickid;
    }

    public String getSickname() {
        return sickname;
    }

    public void setSickname(String sickname) {
        this.sickname = sickname;
    }

    public String getSickcard() {
        return sickcard;
    }

    public void setSickcard(String sickcard) {
        this.sickcard = sickcard;
    }

    public String getSickphone() {
        return sickphone;
    }

    public void setSickphone(String sickphone) {
        this.sickphone = sickphone;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
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

    public Integer getRegid() {
        return regid;
    }

    public void setRegid(Integer regid) {
        this.regid = regid;
    }

    public Patient(Integer sickid, String sickname, String sickcard, String sickphone, String sex, Integer age, String regdate, String sickuname, String sickemail, Integer regid) {
        this.sickid = sickid;
        this.sickname = sickname;
        this.sickcard = sickcard;
        this.sickphone = sickphone;
        this.sex = sex;
        this.age = age;
        this.regdate = regdate;
        this.sickuname = sickuname;
        this.sickemail = sickemail;
        this.regid = regid;
    }
}
