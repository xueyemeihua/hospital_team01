package org.kgc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prescription {
    private Integer prescid;
    private String  drugname;
    private Integer drugcount;
    private Double drugprice;
    private Double drugSubtotal;
    private String drugspeci;
    private Integer prescstate;


    public Double getDrugSubtotal() {
        return drugprice*drugcount;
    }

    //逻辑视图
    public String getPrescstateStr(){
        if (prescstate == null){
            return "未知";
        }
        return prescstate == 0 ? "未抓药":"已抓药";
    }

}
