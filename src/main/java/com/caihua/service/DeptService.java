package com.caihua.service;

import com.caihua.bean.Dept;

public interface DeptService {
    public Dept findDeptById(int did);

    public Dept findDeptByName(String dname);
}
