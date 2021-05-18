package cn.kgc.mapper;

import java.util.List;

import cn.kgc.pojo.Role;

public interface UserMapper {
    List<Role> selectUser();
    Integer selectUserById(Integer id);
    Role insertUser(Role user);
    Integer deleteUser(Integer id);
    Integer updateUser(Role user);
}
