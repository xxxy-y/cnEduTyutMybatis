package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Student;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Author wqt19
 * @ClassName StudentMapperTest
 * @SubmitTime 周五
 * @DATE 2023/11/10
 * @Time 17:46
 * @Package_Name cn.edu.tyut.mapper
 */
class StudentMapperTest {

    @Test
    void selectStudentByName() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = new Student();
            student.setMajor("i");
            List<Student> students = studentMapper.chooseSelectStudentByName(student);
            students.forEach(System.out::println);
        }
    }

    @Test
    void ifSelectStudentByName() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = new Student();
            System.out.println(studentMapper.ifSelectStudentByName(student));
        }
    }

    @Test
    void selectStudentById() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(6);
            List<Student> students = studentMapper.selectStudentById(list);
            students.forEach(System.out::println);
        }
    }
}