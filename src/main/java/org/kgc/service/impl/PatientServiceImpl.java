package org.kgc.service.impl;


import org.apache.ibatis.session.SqlSession;
import org.kgc.mapper.PatientMapper;
import org.kgc.pojo.PageBean;
import org.kgc.pojo.Patient;
import org.kgc.service.PatientService;
import org.kgc.utils.SqlSessionUtil;

import java.util.List;

//病人单业务实现类
public class PatientServiceImpl implements PatientService {
    @Override
    //查询所有病人信息
    public List<Patient> selectAll() {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //获取 PatientMapper
        PatientMapper mapper = sqlSession.getMapper(PatientMapper.class);
        //调用方法
        List<Patient> patients = mapper.selectAll();
        //释放资源
        sqlSession.close();
        //返回结果
        return patients;
    }

    @Override
    //分页查询
    public PageBean<Patient> selectByPage(int currentPage, int pageSize) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //3. 获取BrandMapper
        PatientMapper mapper = sqlSession.getMapper(PatientMapper.class);


        //4. 计算开始索引
        int begin = (currentPage - 1) * pageSize;
        // 计算查询条目数
        int size = pageSize;

        //5. 查询当前页数据
        List<Patient> rows = mapper.selectByPage(begin, size);

        //6. 查询总记录数
        int totalCount = mapper.selectTotalCount();

        //7. 封装PageBean对象
        PageBean<Patient> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);


        //8. 释放资源
        sqlSession.close();
        return pageBean;
    }

    @Override
    //分页条件查询
    public PageBean<Patient> selectByPageAndCondition(int stafid,int currentPage, int pageSize, Patient patient) {
        //获取 SqlSession 对象
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        //3. 获取BrandMapper
        PatientMapper mapper = sqlSession.getMapper(PatientMapper.class);


        //4. 计算开始索引
        int begin = (currentPage - 1) * pageSize;
        // 计算查询条目数
        int size = pageSize;

        // 处理brand条件，模糊表达式
        String sickname = patient.getSickname();
        if (sickname != null && sickname.length() > 0) {
            patient.setSickname("%" + sickname + "%");
        }

        String sickphone = patient.getSickphone();
        if (sickphone != null && sickphone.length() > 0) {
            patient.setSickphone("%" + sickphone + "%");
        }

        //5. 查询当前页数据
        List<Patient> rows = mapper.selectByPageAndCondition(stafid,begin, size, patient);

        //6. 查询总记录数
        int totalCount = mapper.selectTotalCountByCondition(patient);

        //7. 封装PageBean对象
        PageBean<Patient> pageBean = new PageBean<>();
        pageBean.setRows(rows);
        pageBean.setTotalCount(totalCount);


        //8. 释放资源
        sqlSession.close();

        return pageBean;
    }
}
