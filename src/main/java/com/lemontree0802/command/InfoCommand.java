package com.lemontree0802.command;

import com.lemontree0802.mapper.MerchantMapper;
import com.lemontree0802.mapper.UserMapper;
import com.lemontree0802.pojo.Merchant;
import com.lemontree0802.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class InfoCommand {
    private final SqlSessionFactory sqlSessionFactory;

    public InfoCommand(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void execute(String identity, String name) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            if (identity.equals("student") || identity.equals("employee")) {
                UserMapper mapper = session.getMapper(UserMapper.class);
                User currentUser = mapper.selectByName(name);
                currentUser.printMyInfo();
            } else if (identity.equals("merchant")) {
                MerchantMapper mapper = session.getMapper(MerchantMapper.class);
                Merchant currentMerchant = mapper.selectByName(name);
                currentMerchant.printMerchantInfo();
            }


        }
    }
}

