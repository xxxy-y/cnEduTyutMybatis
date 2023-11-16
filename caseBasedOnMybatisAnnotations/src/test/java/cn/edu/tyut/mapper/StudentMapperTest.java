package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Student;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author 羊羊
 * @ClassName StudentMapperTest
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 16:16
 * @Package_Name cn.edu.tyut.mapper
 */
class StudentMapperTest {

    @Test
    void selectStudentById() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            System.out.println(studentMapper.selectStudentByIdCase(1));
        }
    }

    @Test
    void updateStudentByIdCase() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            Student student = new Student();
            student.setName("李雷");
            student.setAge(21);
            student.setId(4);
            System.out.println(studentMapper.updateStudentByIdCase(student));
        }
    }

    @Test
    void findStudent() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.findStudent(2).forEach(System.out::println);
        }
    }
}