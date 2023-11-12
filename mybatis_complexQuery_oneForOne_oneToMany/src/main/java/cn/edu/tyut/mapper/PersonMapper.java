package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Person;

/**
 * @Author wqt19
 * @ClassName PersonMapper
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 15:49
 * @Package_Name cn.edu.tyut.mapper
 */
public interface PersonMapper {
    /**
     * 返回查询到的学生的所有信息
     *
     * @param id 学号
     * @return 学生列表
     */
    Person getPersonById(int id);

    /**
     * >>
     * @param id >>
     * @return >>
     */

    Person getPersonById01(int id);
}
