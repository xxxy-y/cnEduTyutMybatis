package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wqt19
 * @ClassName Orders
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 17:09
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class Orders implements Serializable {
    private Integer id;
    private String number;
}
