package org.kgc.pojo;


public class Paiban {
    private int paibanid;
    private int stafid;
    private String date;

    @Override
    public String toString() {
        return "Paiban{" +
                "paibanid=" + paibanid +
                ", stafid=" + stafid +
                ", date='" + date + '\'' +
                '}';
    }

    public int getPaibanid() {
        return paibanid;
    }

    public void setPaibanid(int paibanid) {
        this.paibanid = paibanid;
    }

    public int getStafid() {
        return stafid;
    }

    public void setStafid(int stafid) {
        this.stafid = stafid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Paiban() {
    }

    public Paiban(int paibanid, int stafid, String date) {
        this.paibanid = paibanid;
        this.stafid = stafid;
        this.date = date;
    }
}
