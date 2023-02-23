package org.kgc.pojo;

import netscape.security.PrivilegeTable;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-17:59
 */
public class CaseNumByDoctor {
    private int casenum;
    private  String deptname;
    private int index;

    @Override
    public String toString() {
        return "CaseNumByDoctor{" +
                "casenum=" + casenum +
                ", deptname='" + deptname + '\'' +
                ", index=" + index +
                '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public CaseNumByDoctor() {
    }

    public int getCasenum() {
        return casenum;
    }

    public void setCasenum(int casenum) {
        this.casenum = casenum;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public CaseNumByDoctor(int casenum, String deptname, int index) {
        this.casenum = casenum;
        this.deptname = deptname;
        this.index = index;
    }
}
