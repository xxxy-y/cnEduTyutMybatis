package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.User;

import java.util.List;

/**
 * @Author wqt19
 * @ClassName UserMapper
 * @SubmitTime 周二
 * @DATE 2023/11/7
 * @Time 11:10
 * @Package_Name cn.edu.tyut.mapper
 */
public interface UserMapper {
    List<User> selectUser();
}
