package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wqt19
 * @ClassName User
 * @SubmitTime 周二
 * @DATE 2023/11/7
 * @Time 11:09
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class User implements Serializable {
    private int id;
    private String username;
    private String sex;
    private int age;
}