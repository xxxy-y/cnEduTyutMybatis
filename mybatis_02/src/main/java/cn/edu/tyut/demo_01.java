package cn.edu.tyut;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.mapper.UserMapper;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * wqt19
 *
 * @ClassName demo_01
 * @SubmitTime 周六
 * @DATE 2023/10/28
 * @Time 15:57
 */
public class demo_01 {
    @SneakyThrows
    public static void main(String[] args) {
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        try (SqlSession sqlSession = sqlSessionFactory.openSession()) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.getUsers();
            users.forEach(System.out::println);
        }
    }
}
