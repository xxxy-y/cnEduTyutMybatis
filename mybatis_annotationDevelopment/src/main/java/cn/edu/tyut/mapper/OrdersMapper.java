package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Orders;
import org.apache.ibatis.annotations.CacheNamespace;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName OrdersMapper
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:10
 * @Package_Name cn.edu.tyut.mapper
 */
@CacheNamespace()
public interface OrdersMapper {
    /**
     * >>
     *
     * @param id >>
     * @return >>
     */
    @Select("SELECT * FROM orders WHERE userId = #{userId}")
    @Results({
        @Result(id = true, property = "id", column = "id"),
        @Result(property = "number", column = "number")
    })
    List<Orders> selectOrderByUserId(int id);
}
