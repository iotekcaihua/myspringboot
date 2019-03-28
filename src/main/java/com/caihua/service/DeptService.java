package com.caihua.service;

import com.caihua.bean.Dept;

public interface DeptService {
    Dept findDeptById(int did);

    Dept findDeptByName(String dname);
}
