package cn.edu.tyut.mapper;

import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName ProductMapperTest
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:55
 * @Package_Name cn.edu.tyut.mapper
 */
class ProductMapperTest {

    @Test
    void selectProductByIndentsId() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            ProductMapper productMapper = sqlSession.getMapper(ProductMapper.class);
            System.out.println(productMapper.selectProductByIndentsId(1));
        }
    }
}