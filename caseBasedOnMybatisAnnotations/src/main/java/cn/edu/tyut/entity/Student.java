package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName sStudent
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 16:11
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Student implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String className;
}
