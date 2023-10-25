CREATE DATABASE mybatistest;
USE mybatistest;
CREATE TABLE `users`
(
    `id`       int NOT NULL AUTO_INCREMENT,
    `username` varchar(32) DEFAULT NULL,
    `sex`      varchar(8)  DEFAULT NULL,
    `age`      int         DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 9
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;
DESC users;
INSERT INTO users(username, sex, age) VALUES ('wqt', 'man', 20), ('admin', 'woman', 30);