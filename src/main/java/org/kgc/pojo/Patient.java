package org.kgc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.kgc.utils.IDCardUtil;

//病人信息类
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    private Integer sickid;
    private String sickname;
    private String sickcard;
    private String sickphone;
    private String sex;
    private Integer age;
    private String regdate;
    private String sickuname;
    private String sickemail;
    private Integer regid;


    public String getSex() {
        return IDCardUtil.getGenderByIdCard(sickcard);
    }

    public Integer getAge() {
        return IDCardUtil.getAgeByIdCard(sickcard);
    }


}
