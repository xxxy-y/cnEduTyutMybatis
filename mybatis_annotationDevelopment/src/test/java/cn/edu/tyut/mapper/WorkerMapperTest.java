package cn.edu.tyut.mapper;

import cn.edu.tyut.entity.Worker;
import cn.edu.tyut.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author 羊羊
 * @ClassName WorkerMapperTest
 * @SubmitTime 周三
 * @DATE 2023/11/15
 * @Time 19:48
 * @Package_Name cn.edu.tyut.mapper
 */
class WorkerMapperTest {
    @Test
    void findWorkerById() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);
            System.out.println(workerMapper.selectWorker(1));
        }
    }

    @Test
    void insertWorker() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);
            Worker worker = new Worker().setName("aa").setSex("man").setAge(20).setWorkerId(1004);
            System.out.println(workerMapper.insertWorker(worker));
        }
    }

    @Test
    void updateWorker() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);
            Worker worker = new Worker();
            worker.setName("wqt");
            worker.setAge(20);
            worker.setId(1);
            System.out.println(workerMapper.updateWorker(worker));
        }
    }

    @Test
    void deleteWorker() {
        try (SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);
            System.out.println(workerMapper.deleteWorker(1));
        }
    }

    @Test
    void selectWorkerByIdAndName() {
        try(SqlSession sqlSession = MybatisUtils.getSqlsession(true)) {
            WorkerMapper workerMapper = sqlSession.getMapper(WorkerMapper.class);
            System.out.println(workerMapper.selectWorkerByIdAndName(2, "李四"));
        }
    }
}