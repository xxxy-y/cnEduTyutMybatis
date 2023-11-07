package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author wqt19
 * @ClassName UserMapperTest
 * @SubmitTime 周二
 * @DATE 2023/11/7
 * @Time 11:20
 * @Package_Name cn.edu.tyut.mapper
 */
class UserMapperTest {

    @Test
    void selectUser() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.selectUser();
            users.forEach(System.out::println);
        }
    }
}