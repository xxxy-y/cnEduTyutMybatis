import cn.edu.tyut.entity.User;

import java.sql.*;
import java.util.Scanner;

/**
 * wqt19
 *
 * @ClassName main
 * @SubmitTime 周一
 * @DATE 2023/10/23
 * @Time 15:00
 */
public class main {
    public static void main(String[] args) {
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
