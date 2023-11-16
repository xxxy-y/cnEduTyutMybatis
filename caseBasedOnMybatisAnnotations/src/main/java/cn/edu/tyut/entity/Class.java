package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName Class
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 16:13
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Class implements Serializable {
    private Integer id;
    private String className;
}
