package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName Person
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 13:26
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Person implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private IdCard card;
}