package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wqt19
 * @ClassName Student
 * @SubmitTime 周五
 * @DATE 2023/11/10
 * @Time 17:35
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Student implements Serializable {
    private int id;
    private String name;
    private String major;
}
