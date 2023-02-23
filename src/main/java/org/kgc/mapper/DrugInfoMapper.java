package org.kgc.mapper;

import org.apache.ibatis.annotations.Param;
import org.kgc.pojo.DrugInfo;

import java.util.HashMap;
import java.util.List;

/**
 * ClassName: DrugInfoMapper
 * Package: cn.kgc.hospital.mapper
 * Description:
 *
 * @Author 东台小姜
 * @Create 2023/1/30 9:20
 * @Version 1.0
 */
public interface DrugInfoMapper {
    //查询所有
//    List<HashMap> selectAll();
    List<HashMap> selectAll();
    //添加
    void add(DrugInfo drugInfo);
    //根据 drugid 查询
    DrugInfo selectById(int drugid);
    //修改
    void update(DrugInfo drugInfo);
    //根据 drugid 删除
    void deleteById(int drugid);

    //模糊查询
    List<HashMap> selectDrugInfo(String drugname);

    //查询过期药品
    List<HashMap> selectDateDrugInfo(String drugindate);

    List<HashMap> SelectUnDateDrugInfo(String format);

    /*根据药品名和功能模糊查询*/
    List<HashMap> mohuSearchDrug(@Param("drugname") String drugname, @Param("drugfunc") String drugfunc);


}
