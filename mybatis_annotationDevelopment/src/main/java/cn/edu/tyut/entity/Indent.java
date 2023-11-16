package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 羊羊
 * @ClassName Indent
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:47
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Indent implements Serializable {
    private Integer id;
    private Integer number;
    private List<Product> productList;
}
