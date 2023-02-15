package org.kgc.pojo;

public class Deptinfo {
    private int deptid;
    private String deptname;

    public Deptinfo(int deptid, String deptname) {
        this.deptid = deptid;
        this.deptname = deptname;
    }

    public Deptinfo() {
    }

    public int getDeptid() {
        return deptid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    @Override
    public String toString() {
        return "Deptinfo{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                '}';
    }
}
