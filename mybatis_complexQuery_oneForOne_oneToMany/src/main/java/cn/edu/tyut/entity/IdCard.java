package cn.edu.tyut.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author wqt19
 * @ClassName IdCard
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 15:39
 * @Package_Name cn.edu.tyut.entity
 */
@Data
public class IdCard implements Serializable {
    private Integer id;
    private String code;
}