package cn.edu.tyut.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author wqt19
 * @ClassName MybatisUtils
 * @SubmitTime 周二
 * @DATE 2023/11/7
 * @Time 11:13
 * @Package_Name cn.edu.tyut.utils
 */
public class MybatisUtils {
    private static final InputStream INPUT_STREAM;

    static {
        try {
            INPUT_STREAM = Resources.getResourceAsStream("Mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(INPUT_STREAM);

    public static SqlSession getSqlsession(boolean autoCommit) {
        return  sqlSessionFactory.openSession(autoCommit);
    }
}
