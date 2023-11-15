package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.School;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author 羊羊
 * @ClassName SchoolMapperTest
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 17:38
 * @Package_Name cn.edu.tyut.mapper
 */
class SchoolMapperTest {

    @Test
    void insertSchool() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            SchoolMapper schoolMapper = sqlSession.getMapper(SchoolMapper.class);
            School school = new School().setName("ww").setSex("man");
            System.out.println(schoolMapper.insertSchool(school));
        }
    }

    @Test
    void selectSchool() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            SchoolMapper schoolMapper = sqlSession.getMapper(SchoolMapper.class);
            System.out.println(schoolMapper.selectSchool(1));
        }
    }
}