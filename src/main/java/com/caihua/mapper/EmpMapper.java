package com.caihua.mapper;

import com.caihua.bean.Employee;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpMapper {
     public Employee findEmp(int eid);
}
