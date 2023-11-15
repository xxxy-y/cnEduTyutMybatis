package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.School;
import org.apache.ibatis.annotations.*;

/**
 * @Author 羊羊
 * @ClassName SchoolMapper
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 17:31
 * @Package_Name cn.edu.tyut.mapper
 */
@CacheNamespace()
public interface SchoolMapper {
    /**
     * // @CacheNamespace()注解配置开启二级缓存
     * 注解插入对象
     * @param school >>
     * @return >>
     */
    @Insert("INSERT INTO school(sid, name, sex) VALUES (#{sid}, #{name}, #{sex})")
    int insertSchool(School school);

    /**
     * 查找对象
     * // @Options注解 设置单个操作的二级缓存配置
     * @param sid >>
     * @return >>
     */
    @Options(useCache = false)
    @Results({
            @Result(id = true, property = "sid", column = "sid"),
            @Result(property = "name", column = "name"),
            @Result(property = "sex", column = "sex")
    })
    @Select("SELECT * FROM school WHERE sid = #{sid}")
    School selectSchool(int sid);
}
