package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 羊羊
 * @ClassName Indent
 * @SubmitTime 周一
 * @DATE 2023/11/13
 * @Time 18:22
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Indent implements Serializable {
    private Integer id;
    private String number;
    private List<Product> productList;
}