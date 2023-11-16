package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Customer;
import org.apache.ibatis.annotations.*;

/**
 * @Author 羊羊
 * @ClassName CustomerMapper
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:10
 * @Package_Name cn.edu.tyut.mapper
 */
@CacheNamespace()
public interface CustomerMapper {
    /**
     * 注解方式实现一对多查询
     * @param id 》》
     * @return 》》
     */
    @Select("SELECT * FROM customer WHERE id = #{id}")
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "ordersList", column = "id",
                    many = @Many(select = "cn.edu.tyut.mapper.OrdersMapper.selectOrderByUserId"))
    })
    Customer selectCustomerById(int id);
}