package cn.edu.tyut;

import cn.edu.tyut.entity.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * wqt19
 *
 * @ClassName ${demo_01}
 * @SubmitTime 周一
 * @DATE 2023/10/23
 * @Time 13:02
 */
public class demo_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputStream inputStream = null;
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        // 查找一个用户数据
        int selectId = scanner.nextInt();
        User selectUser = sqlSession.selectOne("User.getUserByIdOne", selectId);
        System.out.println(selectUser);

        // 插入一个用户数据
        User insertUser = new User();
        insertUser.setId(scanner.nextInt());
        scanner.nextLine();
        insertUser.setUsername(scanner.nextLine());
        insertUser.setSex(scanner.nextLine());
        insertUser.setAge(scanner.nextInt());
        scanner.nextLine();
        int result = sqlSession.insert("User.InsertUser", insertUser);
        if (result > 0) {
            System.out.println("User data was inserted successfully");
        } else {
            System.out.println("User data insertion failed");
        }

        // 修改一个对象数据
        HashMap<String, Object> hashMap = new HashMap<>();
        String hashUsername = scanner.nextLine();
        hashMap.put("username", hashUsername);
        Integer hashId = scanner.nextInt();
        hashMap.put("id", hashId);
        result = sqlSession.update("User.UpdateUser", hashMap);
        if (result > 0) {
            System.out.println("Updating the user data was successful");
        } else {
            System.out.println("Failed to update user data");
        }

        // 删除指定用户id的数据
        int deleteId = scanner.nextInt();
        result = sqlSession.delete("User.DeleteUser", deleteId);
        if (result > 0) {
            System.out.println("Deleting user data was successful");
        } else {
            System.out.println("Failed to delete user data");
        }

        // 查找全部用户数据
        System.out.println("All user's details");
        List<User> users = sqlSession.selectList("User.selectUsers");
        users.forEach(System.out::println);
    }
}