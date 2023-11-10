package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Student;

import java.util.List;

/**
 * @Author wqt19
 * @ClassName StudentMapper
 * @SubmitTime 周五
 * @DATE 2023/11/10
 * @Time 17:38
 * @Package_Name cn.edu.tyut.mapper
 */
public interface StudentMapper {
    /**
     * 使用choose动态SQL标签来查询学生信息
     *
     * @param student 学生信息
     * @return 查询到的学生列表
     */
    List<Student> chooseSelectStudentByName(Student student);

    /**
     * 使用if动态SQL标签来查询学生信息
     *
     * @param student 学生信息
     * @return 查询到的学生列表
     */
    List<Student> ifSelectStudentByName(Student student);

    /**
     * 查找特定id的学生
     * @param list 要查询的学生id列表
     * @return 查询到的学生信息列表
     */
    List<Student> selectStudentById(List<Integer> list);
}
