package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.IdCard;

/**
 * @Author wqt19
 * @ClassName IdCardMapper
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 15:50
 * @Package_Name cn.edu.tyut.mapper
 */
public interface IdCardMapper {
    /**
     * 返回查询到的卡的详细信息
     *
     * @param id 卡号
     * @return 卡信息列表
     */
    IdCard getIdCardById(int id);
}