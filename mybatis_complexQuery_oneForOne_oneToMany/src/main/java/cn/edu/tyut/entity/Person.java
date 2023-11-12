package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wqt19
 * @ClassName Person
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 15:39
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