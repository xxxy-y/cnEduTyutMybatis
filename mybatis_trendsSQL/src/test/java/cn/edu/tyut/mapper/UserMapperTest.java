package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
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
    void ifSelectUser() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setSex("男");
            List<User> users = userMapper.ifSelectUser(user);
            users.forEach(System.out::println);
        }
    }

    @Test
    void whereSelectUser() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setSex("男");
            List<User> users = userMapper.whereSelectUser(user);
            users.forEach(System.out::println);
        }
    }

    @Test
    void chooseSelectUser() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setSex("男");
            List<User> users = userMapper.chooseSelectUser(user);
            users.forEach(System.out::println);
        }
    }

    @Test
    void trimSelectUser() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setUsername("wqt");
            user.setSex("男");
            List<User> users = userMapper.trimSelectUser(user);
            users.forEach(System.out::println);
        }
    }

    @Test
    void setUpdateUser() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setId(3);
            user.setUsername("kk");
            int i = userMapper.setUpdateUser(user);
            System.out.println(i);
        }
    }

    @Test
    void findByArray() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Integer[] array = new Integer[]{1, 2, 3, 5, 14};
            userMapper.findByArray(array).forEach(System.out::println);
        }
    }

    @Test
    void findByList() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(14);
            userMapper.findByList(list).forEach(System.out::println);
        }
    }

    @Test
    void findByMap() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            HashMap<String, Object> hashMap = new HashMap<>();
            hashMap.put("id", 5);
            hashMap.put("sex", "男");
            List<User> user = userMapper.findByMap(hashMap);
            user.forEach(System.out::println);
        }
    }
}