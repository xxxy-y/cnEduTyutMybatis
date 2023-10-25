package cn.edu.tyut;

import cn.edu.tyut.entity.User;

import java.sql.*;
import java.util.Scanner;

/**
 * wqt19
 *
 * @ClassName ${NAME}
 * @SubmitTime 周一
 * @DATE 2023/10/23
 * @Time 13:01
 */
public class demo_01 {
    public static void main(String[] args) {
        // 1.传统的方式
        try {
            // 1.加载驱动
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2.创建连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatistest", "root", "123456");
            // 3.创建SQL语句，得到PrepareStatment对象
            PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE id=? AND username=?");
            Scanner scanner = new Scanner(System.in);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "AA");
            // 4.执行SQL语句
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4));
                System.out.println(user);
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


        // mysql版本在6.0以上就无需手动加载驱动，可以直接使用
        // 2.使用 Statement 连接
        //   将继承了 AutoCloseable 的类放在try中，在退出try的作用域的时候可以被自动关闭
        //   例如在下面的connection和statement就会在退出try的时候自动关闭
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatistest", "root", "123456");
             Statement statement = connection.createStatement()) {
            String sql = "UPDATE users set username='wqt' WHERE id=1";
            int result = statement.executeUpdate(sql);
            System.out.println(result);
            sql = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4));
                System.out.println(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        // 3.使用 PreparedStatement 连接
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatistest", "root", "123456");
             PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users(username, sex, age) VALUES ('A', 'man', 30)");
             PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM users")) {
            int result = preparedStatement.executeUpdate();
            System.out.println(result);
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4));
                System.out.println(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybatistest", "root", "123456");
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM users WHERE id=?");
             PreparedStatement preparedStatement1 = connection.prepareStatement("SELECT * FROM users")) {
            Scanner scanner = new Scanner(System.in);
            preparedStatement.setString(1, scanner.nextLine());
            int result = preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement1.executeQuery();
            while (resultSet.next()) {
                User user = new User(resultSet.getInt(1), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4));
                System.out.println(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}