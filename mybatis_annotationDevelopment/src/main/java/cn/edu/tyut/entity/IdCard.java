package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author 羊羊
 * @ClassName IdCard
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 13:24
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class IdCard implements Serializable {
    private Integer id;
    private Integer code;
}
