package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Employee;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author wqt19
 * @ClassName EmployeeMapperTest
 * @SubmitTime 周一
 * @DATE 2023/11/6
 * @Time 15:06
 * @Package_Name cn.edu.tyut.mapper
 */
class EmployeeMapperTest {
    @Test
    void selectEmployees() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            List<Employee> employees = employeeMapper.selectEmployees();
            employees.forEach(System.out::println);
        }
    }

    @Test
    void insertEmployee() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.setName("insertTest");
            employee.setAge(2);
            employee.setPosition("pojo");
            int i = employeeMapper.insertEmployee(employee);
            System.out.println(i);
        }
    }

    @Test
    void updateEmployee() {
    }

    @Test
    void iEmployee() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
            Employee employee = new Employee();
            employee.setName("u");
            employee.setAge(30);
            employee.setPosition("员工");
            int i = employeeMapper.iEmployee(employee);
            System.out.println(i);
        }
    }


    @Test
    void testLog(){
        Logger logger = Logger.getLogger(EmployeeMapperTest.class);
        logger.info("1231");
    }
}