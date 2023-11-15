package cn.edu.tyut.entity;

import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName School
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 16:55
 * @Package_Name cn.edu.tyut.entity
 */
@Data
@Accessors(chain = true)
public class School implements Serializable {
    private Integer sid;
    private String name;
    private String sex;
}
