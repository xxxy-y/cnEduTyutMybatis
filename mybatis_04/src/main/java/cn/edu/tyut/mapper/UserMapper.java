package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.User;

import java.util.List;

/**
 * wqt19
 *
 * @ClassName UserMapper
 * @SubmitTime 周日
 * @DATE 2023/11/5
 * @Time 11:37
 */
public interface UserMapper {
    List<User> selectUsers();
}
