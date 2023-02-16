package org.kgc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CaseInfo {
    private Integer caseid;
    private String diagnosis;
    private String curescheme;
    private String curetime;
    private Integer sickid;
    private Integer stafid;
    private Integer casestate;
    private Integer regid;

    //逻辑视图
    public String getCasestateStr(){
        if (casestate == null){
            return "未知";
        }
        return casestate == 0 ? "未接诊":"已接诊";
    }

}
