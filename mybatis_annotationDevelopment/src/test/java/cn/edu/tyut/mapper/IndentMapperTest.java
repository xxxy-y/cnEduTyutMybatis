package cn.edu.tyut.mapper;

import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName IndentMapperTest
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 15:41
 * @Package_Name cn.edu.tyut.mapper
 */
class IndentMapperTest {

    @Test
    void selectIndentsById() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            IndentMapper indentMapper = sqlSession.getMapper(IndentMapper.class);
            System.out.println(indentMapper.selectIndentsById(1));
        }
    }
}