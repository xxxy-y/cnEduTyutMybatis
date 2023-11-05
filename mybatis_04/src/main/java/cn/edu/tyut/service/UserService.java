package cn.edu.tyut.service;

import cn.edu.tyut.entity.User;

import java.util.List;

/**
 * wqt19
 *
 * @ClassName UserService
 * @SubmitTime 周日
 * @DATE 2023/11/5
 * @Time 11:39
 */
public interface UserService {
    List<User> selectUsers();
}
