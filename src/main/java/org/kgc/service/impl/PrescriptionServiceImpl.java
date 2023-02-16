package org.kgc.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PrescriptionMapper;
import org.kgc.pojo.DrugInfo;
import org.kgc.pojo.PrescInfo;
import org.kgc.pojo.Prescription;
import org.kgc.service.PrescriptionService;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

//处方单业务实现类
public class PrescriptionServiceImpl implements PrescriptionService {

    //获取 SqlSession 对象
    SqlSession sqlSession = SqlSessionUtil.getSqlSession();
    //获取 PrescriptionMapper
    PrescriptionMapper mapper = sqlSession.getMapper(PrescriptionMapper.class);
    @Override
    //根据药品名称查询药品信息
    public DrugInfo selectByNameDrug(String drugname) {
//        //获取 SqlSession 对象
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        //获取 PrescriptionMapper
//        PrescriptionMapper mapper = sqlSession.getMapper(PrescriptionMapper.class);
        //调用方法
        DrugInfo drugInfo = mapper.selectByNameDrug(drugname);
        //释放资源
        sqlSession.close();
        //返回结果
        return drugInfo;
    }
    @Override
    //根据处方编号查询病例信息
    public Prescription selectByIdPresc(int prescid) {
//        //获取 SqlSession 对象
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        //获取 PrescriptionMapper
//        PrescriptionMapper mapper = sqlSession.getMapper(PrescriptionMapper.class);
        //调用方法
        Prescription prescription = mapper.selectByIdPresc(prescid);
        //释放资源
        sqlSession.close();
        //返回结果
        return prescription;
    }
    @Override
    //添加处方单数据
    public void addPresc(List<PrescInfo> prescInfos) {
//        //获取 SqlSession 对象
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        //获取 PrescriptionMapper
//        PrescriptionMapper mapper = sqlSession.getMapper(PrescriptionMapper.class);
        //调用方法
        mapper.addPresc(prescInfos);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    @Override
    public Prescription selectByIdBingli(int caseid) {
//        //获取 SqlSession 对象
//        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
//        //获取 PrescriptionMapper
//        PrescriptionMapper mapper = sqlSession.getMapper(PrescriptionMapper.class);
        //调用方法
        Prescription prescription = mapper.selectByIdBingli(caseid);
        //释放资源
        sqlSession.close();
        //返回结果
        return prescription;
    }

    @Override
    public List<Prescription> getPrescByCaseid(int caseid) {
        List<Prescription> prescription = mapper.getPrescByCaseid(caseid);
        return prescription;
    }
}
