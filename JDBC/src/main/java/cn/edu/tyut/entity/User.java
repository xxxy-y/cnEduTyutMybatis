package cn.edu.tyut.entity;

import lombok.Data;

/**
 * wqt19
 *
 * @ClassName user
 * @SubmitTime 周一
 * @DATE 2023/10/23
 * @Time 14:34
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String sex;
    private Integer age;

    public User(Integer id, String username, String sex, Integer age) {
        this.id = id;
        this.username = username;
        this.sex = sex;
        this.age = age;
    }

}