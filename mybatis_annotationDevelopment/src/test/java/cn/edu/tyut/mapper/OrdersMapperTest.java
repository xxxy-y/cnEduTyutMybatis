package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Orders;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author 羊羊
 * @ClassName OrdersMapperTest
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 14:16
 * @Package_Name cn.edu.tyut.mapper
 */
class OrdersMapperTest {
    @Test
    void selectOrderByUserId() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            OrdersMapper ordersMapper = sqlSession.getMapper(OrdersMapper.class);
            List<Orders> orders = ordersMapper.selectOrderByUserId(1);
            orders.forEach(System.out::println);
        }
    }
}