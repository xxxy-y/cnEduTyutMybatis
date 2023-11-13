package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Product;

/**
 * @Author 羊羊
 * @ClassName ProductMapper
 * @SubmitTime 周一
 * @DATE 2023/11/13
 * @Time 18:29
 * @Package_Name cn.edu.tyut.mapper
 */
public interface ProductMapper {
    /**
     * >>
     * @param id >>
     * @return >>
     */
    Product findProductById(int id);
}
