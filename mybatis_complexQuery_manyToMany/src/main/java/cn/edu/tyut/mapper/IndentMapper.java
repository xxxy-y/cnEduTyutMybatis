package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Indent;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName IndentMapper
 * @SubmitTime 周一
 * @DATE 2023/11/13
 * @Time 18:29
 * @Package_Name cn.edu.tyut.mapper
 */
public interface IndentMapper {
    /**
     * >>
     *
     * @param id >>
     * @return >>
     */
    List<Indent> findOrdersWithProduct(int id);

    /**
     * >>
     *
     * @param id >>
     * @return >>
     */
    List<Indent> findOrdersWithProduct2(int id);
}
