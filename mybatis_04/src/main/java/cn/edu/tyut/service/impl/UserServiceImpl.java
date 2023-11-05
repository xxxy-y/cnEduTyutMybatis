package cn.edu.tyut.service.impl;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.mapper.UserMapper;
import cn.edu.tyut.service.UserService;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author wqt19
 * @ClassName UserServiceImpl
 * @SubmitTime 周日
 * @DATE 2023/11/5
 * @Time 11:39
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<User> selectUsers() {
        try (SqlSession sqlSession = MybatisUtils.getSqlSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.selectUsers();
            return users;
        }
    }
}
