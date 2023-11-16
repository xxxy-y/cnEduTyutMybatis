package cn.edu.tyut.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName Worker
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 19:45
 * @Package_Name cn.edu.tyut.entity
 */
@Data
@Accessors(chain = true)
public class Worker implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private Integer workerId;
}
