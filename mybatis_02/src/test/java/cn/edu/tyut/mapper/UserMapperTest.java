package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * wqt19
 *
 * @ClassName UserMapperMybatis02Test
 * @SubmitTime 周四
 * @DATE 2023/11/2
 * @Time 15:32
 */
class UserMapperTest {

    @Test
    void selectUsers() {
        SqlSession sqlSession = MybatisUtils.getSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.selectUsers();
        users.forEach(System.out::println);
    }

    @Test
    void getUserByIdOne() {
    }

    @Test
    void getUserByNameOne() {
    }

    @Test
    void insertUser() {
    }

    @Test
    void updateUser() {
    }

    @Test
    void deleteUser() {
    }
}