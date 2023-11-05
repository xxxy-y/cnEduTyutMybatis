package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * wqt19
 *
 * @ClassName UserMapperTest
 * @SubmitTime 周日
 * @DATE 2023/11/5
 * @Time 11:51
 */
class UserMapperTest {

    @Test
    void selectUsers() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.selectUsers();
            users.forEach(System.out::println);
        }
    }
}