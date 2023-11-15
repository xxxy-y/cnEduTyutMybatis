package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Category;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName CategoryMapper
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 9:31
 * @Package_Name cn.edu.tyut.mapper
 */
public interface CategoryMapper {
    /**
     * >>
     * @param typeName >>
     * @return >>
     */
    List<Category> findWhite(String typeName);
}
