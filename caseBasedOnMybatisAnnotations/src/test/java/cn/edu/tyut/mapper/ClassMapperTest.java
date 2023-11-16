package cn.edu.tyut.mapper;

import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName ClassMapperTest
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 16:24
 * @Package_Name cn.edu.tyut.mapper
 */
class ClassMapperTest {

    @Test
    void testGetClass() {
        try(SqlSession sqlSession = MybatisUtils.getSqlsession(true)){
            ClassMapper classMapper = sqlSession.getMapper(ClassMapper.class);
            System.out.println(classMapper.getClass(2));
        }
    }
}