package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.IdCard;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Select;

/**
 * @Author 羊羊
 * @ClassName IdCardMapper
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 13:38
 * @Package_Name cn.edu.tyut.mapper
 */
@CacheNamespace()
public interface IdCardMapper {
    /**
     * >>
     * @param id >>
     * @return >>
     */
    @Select("SELECT * FROM idcard WHERE id = #{id}")
    IdCard selectIdCardById(int id);
}
