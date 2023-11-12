package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Person;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author wqt19
 * @ClassName PersonMapperTest
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 16:17
 * @Package_Name cn.edu.tyut.mapper
 */
class PersonMapperTest {
    @Test
    void getPersonById() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            Person person = personMapper.getPersonById(1);
            System.out.println(person);
        }
    }

    @Test
    void getPersonById01() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            PersonMapper personMapper = sqlSession.getMapper(PersonMapper.class);
            Person person = personMapper.getPersonById01(1);
            System.out.println(person);
        }
    }
}