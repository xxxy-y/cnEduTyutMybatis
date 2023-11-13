package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 羊羊
 * @ClassName Product
 * @SubmitTime 周一
 * @DATE 2023/11/13
 * @Time 18:22
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Product implements Serializable {
    private Integer id;
    private String name;
    private Double price;
    private List<Indent> indents;
}
