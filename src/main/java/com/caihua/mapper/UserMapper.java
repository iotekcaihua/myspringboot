package com.caihua.mapper;

import com.caihua.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    void addUser(User user);
}
