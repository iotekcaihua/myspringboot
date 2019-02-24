package com.caihua.mapper;

import com.caihua.bean.Dept;
import org.springframework.stereotype.Repository;

@Repository
public interface DeptMapper {
   public Dept findDeptById(int did);

   public Dept findDeptByName(String dname);
}
