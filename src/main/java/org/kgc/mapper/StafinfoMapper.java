package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.Stafinfo;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-02-11:03
 */
public interface StafinfoMapper {

    //通过用户名或者手机号或者身份证或者邮箱和登录密码查找用户信息
    Stafinfo getStaffmemberByUsernameOrstafPhoneOrStafcardOrEmailAndPassword(Stafinfo loginInfo);

    List<Stafinfo> getStafmemberByDeptid(@Param("deptid") Integer deptid);

    Stafinfo getStafinfoByStafid(@Param("stafid") Integer stafid);



    //添加医院工作人员
    int addStafInfo(Stafinfo stafinfo);
//    List<Stafinfo> getStafinfos();
    List<HashMap> getStafinfos();
    List<HashMap> getStafinfoLikeDeptnameOrPostnameOrStafname(@Param("deptname") String deptname, @Param("postname") String postname, @Param("stafname") String stafname);
    int firedStafinfo(@Param("stafid") int stafid);

}
