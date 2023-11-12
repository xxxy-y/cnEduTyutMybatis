package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Customer;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author wqt19
 * @ClassName CustomerMapperTest
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 17:25
 * @Package_Name cn.edu.tyut.mapper
 */
class CustomerMapperTest {

    @Test
    void findCustomerWithOrders() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Customer customers = customerMapper.findCustomerWithOrders(1);
            System.out.println(customers);
        }
    }

    @Test
    void getCustomer() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);
            Customer customers = customerMapper.getCustomer(1);
            System.out.println(customers);
        }
    }
}