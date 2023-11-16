package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 羊羊
 * @ClassName customer
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:07
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Customer implements Serializable {
    private Integer id;
    private String username;
    private String address;
    private List<Orders> ordersList;
}
