package cn.edu.tyut.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * @Author 羊羊
 * @ClassName ClassMapper
 * @SubmitTime 周四
 * @DATE 2023/11/16
 * @Time 16:14
 * @Package_Name cn.edu.tyut.mapper
 */
public interface ClassMapper {
    /**
     * >>
     * @param id >
     * @return >
     */
    @Select("SELECT c_class.classname FROM c_class WHERE id = #{id}")
    String getClass(int id);
}
