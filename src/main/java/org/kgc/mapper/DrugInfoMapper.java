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
    List<DrugInfo> selectDrugInfo(String drugname);

    //查询过期药品
    List<DrugInfo> selectDateDrugInfo(String drugindate);

    List<DrugInfo> SelectUnDateDrugInfo(String format);
}
