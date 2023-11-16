package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Indent;
import org.apache.ibatis.annotations.*;

/**
 * @Author 羊羊
 * @ClassName IndentMapper
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:49
 * @Package_Name cn.edu.tyut.mapper
 */
@CacheNamespace()
public interface IndentMapper {
    /**
     * >>
     * @param id >>
     * @return >>
     */
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "number", column = "number"),
            @Result(property = "productList", column = "number",
                    many = @Many(select = "cn.edu.tyut.mapper.ProductMapper.selectProductByIndentsId"))
    })
    @Select("SELECT * FROM indent WHERE id = #{id}")
    Indent selectIndentsById(int id);
}
