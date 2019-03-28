package com.caihua.service;

import com.caihua.bean.Employee;

import javax.jws.WebService;

@WebService
public interface EmpService {
    Employee findEmp(int eid);
}
