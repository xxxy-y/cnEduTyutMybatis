package cn.edu.tyut.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author 羊羊
 * @ClassName MybatisUtils
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 17:34
 * @Package_Name cn.edu.tyut.utils
 */
public class MybatisUtils {
    private static final InputStream INPUTSTREAM;

    static {
        try {
            INPUTSTREAM = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final SqlSessionFactory SQL_SESSION_FACTORY = new SqlSessionFactoryBuilder().build(INPUTSTREAM);

    public static SqlSession getSqlsession(boolean autoCommit) {
        return SQL_SESSION_FACTORY.openSession(autoCommit);
    }
}
