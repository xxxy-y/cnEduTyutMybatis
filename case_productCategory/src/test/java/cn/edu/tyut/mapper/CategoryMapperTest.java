package cn.edu.tyut.mapper;

import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author 羊羊
 * @ClassName CategoryMapperTest
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 9:48
 * @Package_Name cn.edu.tyut.mapper
 */
class CategoryMapperTest {
    @Test
    void findWhite() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            CategoryMapper categoryMapper = sqlSession.getMapper(CategoryMapper.class);
            categoryMapper.findWhite("白色家电").forEach(System.out::println);
        }
    }
}