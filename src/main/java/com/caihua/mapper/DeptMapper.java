package com.caihua.mapper;

import com.caihua.bean.Dept;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptMapper {
   Dept findDeptById(int did);

   Dept findDeptByName(String dname);
}
