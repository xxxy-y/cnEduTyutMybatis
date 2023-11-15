package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 羊羊
 * @ClassName category
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 9:31
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Category implements Serializable {
    private Integer id;
    private String typeName;
    private List<Good> goodList;
}
