package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName ProductMapper
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:51
 * @Package_Name cn.edu.tyut.mapper
 */
public interface ProductMapper {
    /**
     * 查找商品
     * @param ordersId >>
     * @return >>
     */
    @Select("SELECT * FROM product WHERE id IN (SELECT product_id FROM " + "ordersitem WHERE orders_id = #{id})")
    List<Product> selectProductByIndentsId(int ordersId);
}
