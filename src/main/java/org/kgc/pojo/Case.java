package org.kgc.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
//病例类(前端用)
public class Case {
    private Integer caseid;
    private String stafname;
    private String regdesc;
    private String diagnosis;
    private String curescheme;
    private Integer casestate;
    private String curetime;
    private Integer regfee;


    //逻辑视图
    public String getCasestateStr(){
        if (casestate == null){
            return "未知";
        }
        return casestate == 0 ? "未接诊":"已接诊";
    }

}
