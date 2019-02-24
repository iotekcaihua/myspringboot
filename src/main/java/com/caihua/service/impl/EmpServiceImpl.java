package com.caihua.service.impl;

import com.caihua.bean.Employee;
import com.caihua.mapper.EmpMapper;
import com.caihua.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

//@WebService
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapper empMapper;

    @Override
    @WebMethod(operationName="findEmpById")
    @WebResult(name = "Employee")
    public Employee findEmp(int eid) {
        return empMapper.findEmp(eid);
    }
}
