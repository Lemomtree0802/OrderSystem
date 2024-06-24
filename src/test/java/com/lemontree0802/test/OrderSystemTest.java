package com.lemontree0802.test;

import com.lemontree0802.mapper.UserMapper;
import com.lemontree0802.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class OrderSystemTest {
    @Test
    public void testSelectAll() throws IOException {
        // 1. 加载核心配置文件
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        // 2. 获取sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 3. 获取UserMapper接口的代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        // 4. 执行方法
        List<User> users = userMapper.selectAll();
        System.out.println(users);

        // 5. 释放资源
        sqlSession.close();
    }
}
