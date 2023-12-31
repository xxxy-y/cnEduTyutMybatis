package cn.edu.tyut.mapper;

import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

/**
 * wqt19
 *
 * @ClassName UserMapperTest
 * @SubmitTime 周一
 * @DATE 2023/10/30
 * @Time 13:08
 */
class UserMapperTest {
    @Test
    void testGetUsers() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true);) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<Map> users = userMapper.selectUsers();
            users.forEach(System.out::println);
        }
    }
}