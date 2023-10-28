package cn.edu.tyut.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * wqt19
 *
 * @ClassName MybatisUtil
 * @SubmitTime 周六
 * @DATE 2023/10/28
 * @Time 15:52
 */
public class MybatisUtil {
    private static final SqlSessionFactory sqlSessionFactory;
    static InputStream inputStream;

    static {
        try {
            inputStream = Resources.getResourceAsStream("Mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    public static SqlSession getSession(boolean autoCommit) {
        return sqlSessionFactory.openSession(autoCommit);
    }
}
