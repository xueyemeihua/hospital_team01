package org.kgc.pojo;

//药品信息类
public class DrugInfo {
    private Integer drugid;             //药品编号
    private String drugname;        //药品名称
    private Integer druginven;          //药品库存
    private double drugprice;       //药品价格
    private Integer drugindate;         //药品有效期
    private String drugprodate;     //药品生产日期
    private String drugfac;         //生产厂商
    private String facphone;        //厂家电话
    private String drugfunc;        //药品功能
    private String drugspeci;       //药品规格

    public DrugInfo() {
    }

    public DrugInfo(Integer drugid, String drugname, Integer druginven, double drugprice, Integer drugindate, String drugprodate, String drugfac, String facphone, String drugfunc, String drugspeci) {
        this.drugid = drugid;
        this.drugname = drugname;
        this.druginven = druginven;
        this.drugprice = drugprice;
        this.drugindate = drugindate;
        this.drugprodate = drugprodate;
        this.drugfac = drugfac;
        this.facphone = facphone;
        this.drugfunc = drugfunc;
        this.drugspeci = drugspeci;
    }

    /**
     * 获取
     * @return drugid
     */
    public Integer getDrugid() {
        return drugid;
    }

    /**
     * 设置
     * @param drugid
     */
    public void setDrugid(Integer drugid) {
        this.drugid = drugid;
    }

    /**
     * 获取
     * @return drugname
     */
    public String getDrugname() {
        return drugname;
    }

    /**
     * 设置
     * @param drugname
     */
    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    /**
     * 获取
     * @return druginven
     */
    public Integer getDruginven() {
        return druginven;
    }

    /**
     * 设置
     * @param druginven
     */
    public void setDruginven(Integer druginven) {
        this.druginven = druginven;
    }

    /**
     * 获取
     * @return drugprice
     */
    public double getDrugprice() {
        return drugprice;
    }

    /**
     * 设置
     * @param drugprice
     */
    public void setDrugprice(double drugprice) {
        this.drugprice = drugprice;
    }

    /**
     * 获取
     * @return drugindate
     */
    public Integer getDrugindate() {
        return drugindate;
    }

    /**
     * 设置
     * @param drugindate
     */
    public void setDrugindate(Integer drugindate) {
        this.drugindate = drugindate;
    }

    /**
     * 获取
     * @return drugprodate
     */
    public String getDrugprodate() {
        return drugprodate;
    }

    /**
     * 设置
     * @param drugprodate
     */
    public void setDrugprodate(String drugprodate) {
        this.drugprodate = drugprodate;
    }

    /**
     * 获取
     * @return drugfac
     */
    public String getDrugfac() {
        return drugfac;
    }

    /**
     * 设置
     * @param drugfac
     */
    public void setDrugfac(String drugfac) {
        this.drugfac = drugfac;
    }

    /**
     * 获取
     * @return facphone
     */
    public String getFacphone() {
        return facphone;
    }

    /**
     * 设置
     * @param facphone
     */
    public void setFacphone(String facphone) {
        this.facphone = facphone;
    }

    /**
     * 获取
     * @return drugfunc
     */
    public String getDrugfunc() {
        return drugfunc;
    }

    /**
     * 设置
     * @param drugfunc
     */
    public void setDrugfunc(String drugfunc) {
        this.drugfunc = drugfunc;
    }

    /**
     * 获取
     * @return drugspeci
     */
    public String getDrugspeci() {
        return drugspeci;
    }

    /**
     * 设置
     * @param drugspeci
     */
    public void setDrugspeci(String drugspeci) {
        this.drugspeci = drugspeci;
    }

    @Override
    public String toString() {
        return "药品编号：" + drugid + "药品名称：" + drugname +
                "药品库存：" + druginven + "药品价格：" +
                drugprice + "药品有效期：" + drugindate +
                "药品出产日期：" + drugprodate + "药品生产厂家：" +
                drugfac + "药品厂家电话：" + facphone +
                "药品功能：" + drugfunc + "药品规格：" +
                drugspeci + "\n";
    }
}
