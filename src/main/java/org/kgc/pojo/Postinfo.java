package org.kgc.pojo;

public class Postinfo {
    private int postid;
    private String postname;
    private int deptid;

    public int getPostid() {
        return postid;
    }

    @Override
    public String toString() {
        return "Postinfo{" +
                "postid=" + postid +
                ", postname='" + postname + '\'' +
                ", deptid=" + deptid +
                '}';
    }

    public void setPostid(int postid) {
        this.postid = postid;
    }

    public String getPostname() {
        return postname;
    }

    public void setPostname(String postname) {
        this.postname = postname;
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public Postinfo() {
    }

    public Postinfo(int postid, String postname, int deptid) {
        this.postid = postid;
        this.postname = postname;
        this.deptid = deptid;
    }
}
