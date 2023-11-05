package cn.edu.tyut.service;

import cn.edu.tyut.entity.User;

import java.util.List;
import java.util.Map;

/**
 * wqt19
 *
 * @ClassName UserService
 * @SubmitTime 周一
 * @DATE 2023/10/30
 * @Time 13:11
 */
public interface UserService {
    List<Map> selectUsers();

    User getUserByIdOne(Integer id);

    User getUserByNameOne(String username);

    void InsertUser(User user);

    void UpdateUser(Map<String, Object> hashMap);

    void DeleteUser(Integer id);
}
