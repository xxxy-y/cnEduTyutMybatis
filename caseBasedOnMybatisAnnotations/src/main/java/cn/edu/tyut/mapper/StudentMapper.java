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
     * 可以使用@ResultMap(id)来使用xml文件定义映射规则
     * 也可以使用@ConstructorArgs({
     * 。        @Arg(column = "sid", javaType = int.class),
     * 。        @Arg(column = "name", javaType = String.class)
     * })注解来指定构造方法，但是这样的话，不会自己将属性值赋值给对象，需要自己处理。
     * 可以使用@Options()注解来控制单个操作的缓存启用。控制单个操作的缓存启用。
     * 当传入的参数为对象类型时，可以使用参数名称.属性的方式去让Mybatis知道我们要用的是哪个属性。
     * @param cid >>
     * @return >>
     */
    @Options(useCache = false)
    @Results({
            @Result(id = true, property = "id", column = "id"),
            @Result(property = "className", column = "cid",
                    many = @Many(select = "cn.edu.tyut.mapper.ClassMapper.getClass"))
    })
    @Select("SELECT * FROM s_student WHERE cid = #{cid}")
    List<Student> findStudent(int cid);
}
