package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @Author wqt19
 * @ClassName Customer
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 17:08
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Customer implements Serializable {
    private Integer id;
    private String username;
    private String address;
    private List<Orders> ordersList;
}
