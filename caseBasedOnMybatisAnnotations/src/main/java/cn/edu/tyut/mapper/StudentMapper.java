package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Author 羊羊
 * @ClassName StudentMapper
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 16:14
 * @Package_Name cn.edu.tyut.mapper
 */
public interface StudentMapper {
    /**
     * >>
     *
     * @param id >>
     * @return <>>></>
     */
    @Select("SELECT * FROM s_student WHERE id = #{id}")
    Student selectStudentByIdCase(int id);

    /**
     * >>
     *
     * @param student >>
     * @return >>
     */
    @Update("UPDATE s_student SET name = #{name}, age = #{age} WHERE id = #{id}")
    int updateStudentByIdCase(Student student);

    /**
     * >>
     *
     * @param cid >>
     * @return >>
     */
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "className", column = "cid",
                    many = @Many(select = "cn.edu.tyut.mapper.ClassMapper.getClass"))
    })
    @Select("SELECT * FROM s_student WHERE cid = #{cid}")
    List<Student> findStudent(int cid);
}
