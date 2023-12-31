package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.User;

import java.util.List;
import java.util.Map;

/**
 * wqt19
 *
 * @ClassName UserMapper
 * @SubmitTime 周六
 * @DATE 2023/10/28
 * @Time 15:49
 */
// 通过namespace来绑定到一个接口上
public interface UserMapper {
    List<User> selectUsers();

    User getUserByIdOne(Integer id);

    User getUserByNameOne(String username);

    int InsertUser(User user);

    int UpdateUser(Map<String, Object> hashMap);

    int DeleteUser(Integer id);
}
