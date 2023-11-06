package cn.edu.tyut.entity;

import lombok.Data;

/**
 * @Author wqt19
 * @ClassName Employee
 * @SubmitTime 周一
 * @DATE 2023/11/6
 * @Time 14:05
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String position;
}