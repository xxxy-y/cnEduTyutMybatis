package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Worker;
import org.apache.ibatis.annotations.*;

/**
 * @Author 羊羊
 * @ClassName WorkerMapper
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 19:47
 * @Package_Name cn.edu.tyut.mapper
 */
@CacheNamespace()
public interface WorkerMapper {
    /**
     * 查找工人
     *
     * @param id >>
     * @return >>
     */
    @Select("SELECT * FROM worker WHERE id = #{id}")
    Worker selectWorker(int id);

    /**
     * ??
     *
     * @param worker ??
     * @return ??
     */
    @Insert("INSERT INTO worker(name, age, sex, worker_id) VALUES (#{name}, #{age}, #{sex}, #{workerId})")
    int insertWorker(Worker worker);

    /**
     * >>
     *
     * @param worker >>
     * @return >>
     */
    @Update("UPDATE worker SET name = #{name}, age = #{age} WHERE id = #{id}")
    int updateWorker(Worker worker);

    /**
     * >>
     *
     * @param id >>
     * @return ><></>
     */
    @Delete("DELETE FROM worker WHERE id = #{id}")
    int deleteWorker(int id);

    /**
     * >>
     *
     * @param id   >>
     * @param name >>
     * @return >>
     */
    @Select("SELECT * FROM worker WHERE id = #{id} AND name = #{name}")
    Worker selectWorkerByIdAndName(@Param("id") int id, @Param("name") String name);
}
