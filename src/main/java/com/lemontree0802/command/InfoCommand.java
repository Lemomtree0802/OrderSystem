package com.lemontree0802.command;

import com.lemontree0802.mapper.UserMapper;
import com.lemontree0802.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

public class InfoCommand implements Command {
    private final SqlSessionFactory sqlSessionFactory;

    public InfoCommand(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public void execute() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            UserMapper mapper = session.getMapper(UserMapper.class);
            List<User> users = mapper.selectAll();
            users.forEach(user -> System.out.println(user.getName()));
        }
    }
}

