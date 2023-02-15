package org.kgc.service;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PaibanMapper;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

/**
 * @author 雪夜梅花香_ly
 * @create 2023-02-08-21:04
 */
public class PaibanService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    PaibanMapper mapper = session.getMapper(PaibanMapper.class);

    public List<HashMap> getStafsByPaibanOneAndDeptid(Integer deptid) {

        return mapper.getStafsByPaibanOneAndDeptid(deptid);

    }

    public List<HashMap> getStafsByPaibanTwoAndDeptid(Integer deptid) {

        return mapper.getStafsByPaibanTwoAndDeptid(deptid);

    }

    public List<HashMap> getStafsByPaibanThreeAndDeptid(Integer deptid) {

        return mapper.getStafsByPaibanThreeAndDeptid(deptid);

    }

    public List<HashMap> getStafsByPaibanFourAndDeptid(Integer deptid) {

        return mapper.getStafsByPaibanFourAndDeptid(deptid);

    }

    public List<HashMap> getStafsByPaibanFiveAndDeptid(Integer deptid) {

        return mapper.getStafsByPaibanFiveAndDeptid(deptid);

    }

    public List<HashMap> getStafsByPaibanSixAndDeptid(Integer deptid) {

        return mapper.getStafsByPaibanSixAndDeptid(deptid);

    }

    public List<HashMap> getStafsByPaibanSevenAndDeptid(Integer deptid) {

        return mapper.getStafsByPaibanSevenAndDeptid(deptid);

    }


    public List<HashMap> getStafsByGroupOnDept() {
        return mapper.getStafsByGroupOnDept();
    }


}
