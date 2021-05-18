package cn.kgc.mapper;

import java.util.List;

import cn.kgc.pojo.User;

public interface UserMapper {
    List<User> selectUser();
    Integer selectUserById(Integer id);
    User insertUser(User user);
    Integer deleteUser(Integer id);
    Integer updateUser(User user);
}
