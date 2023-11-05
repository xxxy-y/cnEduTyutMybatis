package cn.edu.tyut.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * wqt19
 *
 * @ClassName mybatisUtil
 * @SubmitTime 周日
 * @DATE 2023/11/5
 * @Time 11:43
 */
public class MybatisUtils {
    private static InputStream inputStream;

    static {
        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

     private static SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    public static SqlSession getSqlSession(boolean autocommit) {
        return sqlSessionFactory.openSession(autocommit);
    }
}
