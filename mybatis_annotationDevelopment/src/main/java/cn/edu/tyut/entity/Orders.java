package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName Orders
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:03
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Orders implements Serializable {
    private Integer id;
    private Integer number;
}