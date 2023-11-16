package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName Product
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:46
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Product implements Serializable {
        private Integer id;
        private String name;
        private Double price;
}
