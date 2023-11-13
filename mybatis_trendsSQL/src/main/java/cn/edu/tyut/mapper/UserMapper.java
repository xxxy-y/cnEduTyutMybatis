package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @Author wqt19
 * @ClassName UserMapper
 * @SubmitTime 周二
 * @DATE 2023/11/7
 * @Time 11:10
 * @Package_Name cn.edu.tyut.mapper
 */
public interface UserMapper {
    List<User> ifSelectUser(User user);

    List<User> whereSelectUser(User user);

    List<User> chooseSelectUser(User user);

    List<User> trimSelectUser(User user);

    /**
     * 使用set标签来更新用户数据
     *
     * @param user 更新后的用户属性
     * @return 1 更新成功  0 更新失败
     */
    int setUpdateUser(User user);

    List<User> findByArray(Integer[] array);

    List<User> findByList(List<Integer> list);

    /**
     * 传递给MyBatis的Map对象需要在方法参数中明确声明为@Param注解
      */
    List<User> findByMap(@Param("map") HashMap<String, Object> hashMap);

    List<User> findByMap1(HashMap<String, Object> hashMap);
}
