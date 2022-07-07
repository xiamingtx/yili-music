CREATE TABLE user
    {
        id VARCHAR(32) NOT NULL
            PRIMARY KEY COMMENT '用户ID',
        username VARCHAR(64) NOT NULL COMMENT '用户名',
        password VARCHAR(64) NOT NULL COMMENT '加密后的密码',
        gender VARCHAR(255) NOT NULL COMMENT '性别',
        email VARCHAR(255) NOT NULL COMMENT '邮箱'
    }