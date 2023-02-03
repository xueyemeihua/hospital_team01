package org.kgc.mapper;

import org.kgc.pojo.Sickerinfo;
import org.kgc.pojo.Stafinfo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-11:03
 */
public interface StafinfoMapper {

    //通过用户名或者手机号或者身份证或者邮箱和登录密码查找用户信息
    Stafinfo getStaffmemberByUsernameOrstafPhoneOrStafcardOrEmailAndPassword(Stafinfo loginInfo);


    int updateStaffmemberinfo(Stafinfo staffmemberinfo);


}
