package com.caihua.service;

import com.caihua.bean.User;

public interface UserService {

    User findUser(int id);

    void addUser(User user);

}
