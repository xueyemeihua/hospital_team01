package org.kgc.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.CaseMapper;
import org.kgc.pojo.*;
import org.kgc.service.CaseService;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

//病例单业务实现类
public class CaseServiceImpl implements CaseService {
    @Override
    //查询所有病例信息
    public List<Case> selectAll() {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        List<Case> cases = mapper.selectAll();
        //释放资源
        sqlSession.close();
        //返回结果
        return cases;
    }

    @Override
    //根据病人编号查询该病人的病例信息
    public List<Case> selectByIdCase(int stafid,int sickid,int regid) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        List<Case> cases = mapper.selectByIdCase(stafid,sickid,regid);
        //释放资源
        sqlSession.close();
        //返回结果
        return cases;
    }

    @Override
    //根据病例编号查询该病人的病例的详细信息
    public Case selectByCaseId(int caseid) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        Case bingli = mapper.selectByCaseId(caseid);
        //释放资源
        sqlSession.close();
        //返回结果
        return bingli;
    }

    //修改病例信息
    @Override
    public void updateCase(CaseInfo bingli) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        mapper.updateCase(bingli);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //修改收费标准信息
    @Override
    public void updateRegfee(Regfeestander regfeestander) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        mapper.updateRegfee(regfeestander);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //修改工作人员信息
    @Override
    public void updateStaf(Stafinfo stafinfo) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        mapper.updateStaf(stafinfo);
        //提交事务
        sqlSession.commit();
        //释放资源
        sqlSession.close();
    }

    //根据工作人员比编号查询工作人员信息
    @Override
    public Stafinfo selectByStafId(int stafid) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        Stafinfo stafinfo = mapper.selectByStafId(stafid);
        //释放资源
        sqlSession.close();
        //返回结果
        return stafinfo;
    }

    //根据科室编号查询科室信息
    @Override
    public Rankinfo selectByRankId(int rankid) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        Rankinfo rankinfo = mapper.selectByRankId(rankid);
        //释放资源
        sqlSession.close();
        //返回结果
        return rankinfo;
    }

    //根据收费标准编号查询收费标准信息
    @Override
    public Regfeestander selectByRegfeeStanderId(int regfeeid) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        Regfeestander regfeestander = mapper.selectByRegfeeStanderId(regfeeid);
        //释放资源
        sqlSession.close();
        //返回结果
        return regfeestander;
    }

    @Override
    public CaseInfo selectByCaseInfoId(int caseid) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);
        //调用方法
        CaseInfo caseInfo = mapper.selectByCaseInfoId(caseid);
        //释放资源
        sqlSession.close();
        //返回结果
        return caseInfo;
    }

    @Override
    //分页条件查询
    public PageBean<Case> selectByPageAndCondition(int currentPage, int pageSize, Case bingli) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);


        //4. 计算开始索引
        int begin = (currentPage - 1) * pageSize;
        // 计算查询条目数
        int size = pageSize;

        // 处理brand条件，模糊表达式
        String diagnosis = bingli.getDiagnosis();
        if (diagnosis != null && diagnosis.length() > 0) {
            bingli.setDiagnosis("%" + diagnosis + "%");
        }

        String curescheme = bingli.getCurescheme();
        if (curescheme != null && curescheme.length() > 0) {
            bingli.setCurescheme("%" + curescheme + "%");
        }


        //5. 查询当前页数据
        List<Case> rows = mapper.selectByPageAndCondition(begin, size, bingli);

        //6. 查询总记录数
        int totalCount = mapper.selectTotalCountByCondition(bingli);

        //7. 封装PageBean对象
        PageBean<Case> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);


        //8. 释放资源
        sqlSession.close();

        return pageBean;
    }

    @Override
    public PageBean<Case> selectByPageAndStafid(int currentPage, int pageSize, int stafid) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 CaseMapper
        CaseMapper mapper = sqlSession.getMapper(CaseMapper.class);


        //4. 计算开始索引
        int begin = (currentPage - 1) * pageSize;
        // 计算查询条目数
        int size = pageSize;

        //5. 查询当前页数据
        List<Case> rows = mapper.selectByPageAndStafid(begin, size,stafid);

        //6. 查询总记录数
        int totalCount = mapper.selectTotalCountByStafid(stafid);

        //7. 封装PageBean对象
        PageBean<Case> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);


        //8. 释放资源
        sqlSession.close();

        return pageBean;
    }



}
