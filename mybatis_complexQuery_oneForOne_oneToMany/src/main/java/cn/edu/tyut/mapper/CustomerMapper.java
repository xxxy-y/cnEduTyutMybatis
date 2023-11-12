package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Customer;

/**
 * @Author wqt19
 * @ClassName CustomerMapper
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 17:11
 * @Package_Name cn.edu.tyut.mapper
 */
public interface CustomerMapper {
    /**
     * >>
     * @param id >>
     * @return >>
     */
    Customer findCustomerWithOrders(int id);

    /**
     * >>
     * @param id >>
     * @return >>
     */
    Customer getCustomer(int id);
}
