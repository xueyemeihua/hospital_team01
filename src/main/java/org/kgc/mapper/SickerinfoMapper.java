package org.kgc.mapper;

import org.kgc.pojo.Sickerinfo;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-11:03
 */
public interface SickerinfoMapper {

    //通过用户名或者手机号或者身份证或者邮箱和登录密码查找用户信息
    Sickerinfo getSickerBySickUnameOrSickPhoneOrCardIdOrSickEmailAndPassword(Sickerinfo loginInfo);


    int updateSickerInfo(Sickerinfo sickerinfo);


}
