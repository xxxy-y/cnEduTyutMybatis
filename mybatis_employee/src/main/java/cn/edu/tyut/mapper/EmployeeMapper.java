package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Employee;

import java.util.List;

/**
 * @Author wqt19
 * @ClassName EmployeeMapper
 * @SubmitTime 周一
 * @DATE 2023/11/6
 * @Time 14:59
 * @Package_Name cn.edu.tyut.mapper
 */
public interface EmployeeMapper {

    /**
     * 查找所有员工
     *
     * @return 列表返回所有的Employee
     */
    List<Employee> selectEmployees();

    /**
     * insert an employee detail
     *
     * @param employee yes
     * @return 1/0
     */
    int insertEmployee(Employee employee);

    /**
     * 更新员工信息
     *
     * @param employee 需要更新的员工对象
     * @return 返回更新后的员工信息的ID，如果更新失败则返回-1
     */
    int updateEmployee(Employee employee);

    /**
     * insert an employ detail
     * @param employee - you need employee object
     * @return yes 1, no 0
     */
    int iEmployee(Employee employee);
}
