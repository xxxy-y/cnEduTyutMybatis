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
 * @SubmitTime 周日
 * @DATE 2023/11/12
 * @Time 18:50
 * @Package_Name cn.edu.tyut.utils
 */
public class MybatisUtils {
    private static final InputStream INPUT_STREAM;

    static {
        try {
            INPUT_STREAM = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final SqlSessionFactory SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(INPUT_STREAM);

    public static SqlSession getSqlsession(boolean autoCommit) {
        return SQL_SESSION_FACTORY.openSession(autoCommit);
    }
}
