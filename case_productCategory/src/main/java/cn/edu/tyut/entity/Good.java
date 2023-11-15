package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName good
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 9:28
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Good implements Serializable {
    private Integer id;
    private String goodsName;
    private Double price;
    private Integer typeId;
}
