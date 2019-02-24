package com.caihua.service.impl;

import com.caihua.bean.Dept;
import com.caihua.mapper.DeptMapper;
import com.caihua.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;

    @Override
    public Dept findDeptById(int did) {
        return deptMapper.findDeptById(did);
    }

    @Override
    public Dept findDeptByName(String dname) {
        return deptMapper.findDeptByName(dname);
    }
}
