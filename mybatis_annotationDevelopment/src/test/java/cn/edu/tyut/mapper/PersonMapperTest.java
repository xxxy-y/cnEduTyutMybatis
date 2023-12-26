package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Person;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author 羊羊
 * @ClassName PersonMapperTest
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 13:51
 * @Package_Name cn.edu.tyut.mapper
 */
class PersonMapperTest {
    @Test
    void selectPersonById() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            Person person = personMapper.selectPersonById(1);
            System.out.println(person);
        }
    }
}