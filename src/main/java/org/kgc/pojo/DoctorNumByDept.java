package org.kgc.pojo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-18:08
 */
public class DoctorNumByDept {
    private int stafnum;
    private String deptname;
    private int index;

    @Override
    public String toString() {
        return "DoctorNumByDept{" +
                "stafnum=" + stafnum +
                ", deptname='" + deptname + '\'' +
                ", index=" + index +
                '}';
    }

    public int getStafnum() {
        return stafnum;
    }

    public void setStafnum(int stafnum) {
        this.stafnum = stafnum;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public DoctorNumByDept(int stafnum, String deptname, int index) {
        this.stafnum = stafnum;
        this.deptname = deptname;
        this.index = index;
    }

    public DoctorNumByDept() {
    }
}
