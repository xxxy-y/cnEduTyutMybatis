package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Person;
import org.apache.ibatis.annotations.*;

/**
 * @Author 羊羊
 * @ClassName PersonMapper
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 13:38
 * @Package_Name cn.edu.tyut.mapper
 */
@CacheNamespace()
public interface PersonMapper {
    /**
     * 注解模式一对一查询
     *
     * @param id 》》
     * @return 》》
     */
    @Results(value = {
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "sex", column = "sex"),
            @Result(property = "age", column = "age"),
            @Result(property = "card", column = "card",
                    one = @One(select = "cn.edu.tyut.mapper.IdCardMapper.selectIdCardById"))
    })
    @Select("SELECT * FROM person WHERE id = #{id}")
    Person selectPersonById(int id);
}