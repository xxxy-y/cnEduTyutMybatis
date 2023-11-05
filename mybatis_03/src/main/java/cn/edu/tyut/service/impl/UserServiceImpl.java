package cn.edu.tyut.service.impl;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.mapper.UserMapper;
import cn.edu.tyut.service.UserService;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;


import java.util.List;
import java.util.Map;


/**
 * wqt19
 *
 * @ClassName UserServiceImpl
 * @SubmitTime 周一
 * @DATE 2023/10/30
 * @Time 13:11
 */
public class UserServiceImpl implements UserService {
    @Override
    public List<Map> selectUsers() {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<Map> users = userMapper.selectUsers();
            return users;
        }
    }

    @Override
    public User getUserByIdOne(Integer id) {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserByIdOne(id);
            return user;
        }
    }

    @Override
    public User getUserByNameOne(String username) {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = userMapper.getUserByNameOne(username);
            return user;
        }
    }

    @Override
    public void InsertUser(User user) {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int i = userMapper.InsertUser(user);
            if (i > 0) {
                System.out.println("User information was inserted successfully");
            } else {
                System.out.println("Failed to insert user information");
            }
        }
    }

    @Override
    public void UpdateUser(Map<String, Object> hashMap) {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int i = userMapper.UpdateUser(hashMap);
            if (i > 0) {
                System.out.println("Updating the user data was successful");
            } else {
                System.out.println("Failed to update user data");
            }
        }
    }

    @Override
    public void DeleteUser(Integer id) {
        try (SqlSession sqlSession = MybatisUtils.getSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int i = userMapper.DeleteUser(id);
            if (i > 0) {
                System.out.println("User data was deleted successfully");
            } else {
                System.out.println("Failed to delete user data");
            }
        }
    }
}