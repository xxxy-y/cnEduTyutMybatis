package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Indent;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName IndentMapperTest
 * @SubmitTime 周一
 * @DATE 2023/11/13
 * @Time 18:45
 * @Package_Name cn.edu.tyut.mapper
 */
class IndentMapperTest {

    @Test
    void findOrdersWithProduct() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            IndentMapper indentMapper = sqlSession.getMapper(IndentMapper.class);
            List<Indent> ordersWithProduct = indentMapper.findOrdersWithProduct(1);
            System.out.println(ordersWithProduct);
        }
    }

    @Test
    void findOrdersWithProduct2() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            IndentMapper indentMapper = sqlSession.getMapper(IndentMapper.class);
            System.out.println(indentMapper.findOrdersWithProduct2(1));
        }
    }
}