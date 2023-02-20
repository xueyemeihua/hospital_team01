package org.kgc.service;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.DrugInfoMapper;
import org.kgc.pojo.DrugInfo;
import org.kgc.utils.SqlSessionUtil;

import java.util.HashMap;
import java.util.List;

public class DrugInfoService {

    SqlSession session = SqlSessionUtil.getSqlSession();
    DrugInfoMapper mapper = session.getMapper(DrugInfoMapper.class);

    //查询所有
    public List<HashMap> selectAll() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //调用 DrugInfoMapper.selectAll()
        DrugInfoMapper mapper = sqlSession.getMapper(DrugInfoMapper.class);
        //调用方法
        List<HashMap> drugInfos = mapper.selectAll();
        //关闭资源
        sqlSession.close();
        //返回结果
        return drugInfos;
    }

    //添加
    public void add(DrugInfo drugInfo){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 DrugInfoMapper
        DrugInfoMapper mapper = sqlSession.getMapper(DrugInfoMapper.class);
        //调用方法
        mapper.add(drugInfo);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //根据 drugid 查询
    public DrugInfo selectById(int drugid){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //调用 DrugInfoMapper.selectAll()
        DrugInfoMapper mapper = sqlSession.getMapper(DrugInfoMapper.class);
        //调用方法
        DrugInfo drugInfo = mapper.selectById(drugid);
        //关闭资源
        sqlSession.close();
        //返回结果
        return drugInfo;
    }

    //修改
    public void update(DrugInfo drugInfo){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 DrugInfoMapper
        DrugInfoMapper mapper = sqlSession.getMapper(DrugInfoMapper.class);
        //调用方法
        mapper.update(drugInfo);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //根据 drugid 删除
    public void delete(int drugid){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 DrugInfoMapper
        DrugInfoMapper mapper = sqlSession.getMapper(DrugInfoMapper.class);
        //调用方法
        mapper.deleteById(drugid);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }
//模糊查询
    public List<HashMap> selectDrugInfo(String drugname) {
        List<HashMap> drugs = mapper.selectDrugInfo(drugname);
        session.close();
        return drugs;
    }


    //过期药品查询
    public List<HashMap> date(String drugindate) {
        List<HashMap> drugsindate = mapper.selectDateDrugInfo(drugindate);
        session.close();
        return drugsindate;
    }

    public List<HashMap> getDate(String format) {
        List<HashMap> maps = mapper.SelectUnDateDrugInfo(format);
        session.close();
        return maps;
    }
}
