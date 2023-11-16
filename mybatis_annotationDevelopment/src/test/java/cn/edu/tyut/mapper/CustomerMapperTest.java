package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Customer;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName CustomerMapperTest
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:23
 * @Package_Name cn.edu.tyut.mapper
 */
class CustomerMapperTest {

    @Test
    void selectCustomerById() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Customer customer = customerMapper.selectCustomerById(1);
            System.out.println(customer);
        }
    }
}