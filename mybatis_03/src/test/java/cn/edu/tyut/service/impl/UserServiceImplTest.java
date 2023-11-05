package cn.edu.tyut.service.impl;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.mapper.UserMapper;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * wqt19
 *
 * @ClassName UserServiceImplTest
 * @SubmitTime 周一
 * @DATE 2023/10/30
 * @Time 14:20
 */
class UserServiceImplTest {

    @Test
    void selectUsers() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<Map> users = userMapper.selectUsers();
            users.forEach(System.out::println);
        }
    }

    @Test
    void getUserByIdOne() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserByIdOne(3);
            System.out.println(user);
        }
    }

    @Test
    void getUserByNameOne() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserByNameOne("wqt");
            System.out.println(user);
        }
    }

    @Test
    void insertUser() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setId(1);
            user.setUsername("qq");
            user.setSex("woman");
            user.setAge(90);
            int i = userMapper.InsertUser(user);
            if (i > 0) {
                System.out.println("User information was inserted successfully");
            } else {
                System.out.println("Failed to insert user information");
            }
        }
    }

    @Test
    void updateUser() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> hashMap = new HashMap<>();
            hashMap.put("id", 1);
            hashMap.put("username", "ww");
            int i = userMapper.UpdateUser(hashMap);
            if (i > 0) {
                System.out.println("Updating the user data was successful");
            } else {
                System.out.println("Failed to update user data");
            }
        }
    }

    @Test
    void deleteUser() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int i = userMapper.DeleteUser(1);
            if (i > 0) {
                System.out.println("User data was deleted successfully");
            } else {
                System.out.println("Failed to delete user data");
            }
        }
    }
}