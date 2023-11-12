package cn.edu.tyut.mapper;

import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author wqt19
 * @ClassName IdCardMapperTest
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 16:41
 * @Package_Name cn.edu.tyut.mapper
 */
class IdCardMapperTest {

    @Test
    void getIdCardById() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            IdCardMapper idCardMapper = sqlSession.getMapper(IdCardMapper.class);
            System.out.println(idCardMapper.getIdCardById(1));
        }
    }
}