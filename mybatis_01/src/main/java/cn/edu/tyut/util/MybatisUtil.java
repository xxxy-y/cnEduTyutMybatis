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
 * @Time 15:31
 * <p>
 * 因为SqlSessionFactory一般创建一个就可以了，所以可以创建一个工具类来集中创建SqlSession。
 * 在主体代码中还是没有使用该工具类，而是手动创建。
 * SqlSession sqlSession = MybatisUtil.getSession(true)便可以获得SqlSession。
 */
public class MybatisUtil {
    //在类加载时就进行创建
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

    /**
     * 获取一个新的会话
     *
     * @param autoCommit 是否开启自动提交（跟JDBC是一样的，如果不自动提交，则会变成事务操作）
     * @return SqlSession对象
     */
    public static SqlSession getSession(boolean autoCommit) {
        return sqlSessionFactory.openSession(autoCommit);
    }
}
