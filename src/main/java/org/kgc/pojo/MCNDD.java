package org.kgc.pojo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-23-20:00
 */
public class MCNDD {
    private int mccn;
    private String mcdn;
    private int index;

    @Override
    public String toString() {
        return "MCNDD{" +
                "mccn=" + mccn +
                ", mcdn='" + mcdn + '\'' +
                ", index=" + index +
                '}';
    }

    public int getMccn() {
        return mccn;
    }

    public void setMccn(int mccn) {
        this.mccn = mccn;
    }

    public String getMcdn() {
        return mcdn;
    }

    public void setMcdn(String mcdn) {
        this.mcdn = mcdn;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public MCNDD() {
    }

    public MCNDD(int mccn, String mcdn, int index) {
        this.mccn = mccn;
        this.mcdn = mcdn;
        this.index = index;
    }
}
