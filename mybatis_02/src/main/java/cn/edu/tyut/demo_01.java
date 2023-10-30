package cn.edu.tyut;

import cn.edu.tyut.entity.User;
import cn.edu.tyut.mapper.UserMapper;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = null;
        inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<User> users = userMapper.selectUsers();
            users.forEach(System.out::println);
        }

        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int id = scanner.nextInt();
            scanner.nextLine();
            User user = userMapper.getUserByIdOne(id);
            System.out.println(user);
        }

        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            String username = scanner.nextLine();
            User user = userMapper.getUserByNameOne(username);
            System.out.println(user);
        }

        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            User user = new User();
            user.setId(scanner.nextInt());
            scanner.nextLine();
            user.setUsername(scanner.nextLine());
            user.setSex(scanner.nextLine());
            user.setAge(scanner.nextInt());
            scanner.nextLine();
            int i = userMapper.InsertUser(user);
            if (i > 0) {
                System.out.println("User information was inserted successfully");
            } else {
                System.out.println("Failed to insert user information");
            }
        }

        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            Map<String, Object> hashMap = new HashMap<>();
            int id = scanner.nextInt();
            scanner.nextLine();
            hashMap.put("id", id);
            String username = scanner.nextLine();
            hashMap.put("username", username);
            int i = userMapper.UpdateUser(hashMap);
            if (i > 0) {
                System.out.println("Updating the user data was successful");
            } else {
                System.out.println("Failed to update user data");
            }
        }

        try (SqlSession sqlSession = sqlSessionFactory.openSession(true)) {
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            int id = scanner.nextInt();
            scanner.nextLine();
            int i = userMapper.DeleteUser(id);
            if (i > 0) {
                System.out.println("User data was deleted successfully");
            } else {
                System.out.println("Failed to delete user data");
            }
        }
    }
}
