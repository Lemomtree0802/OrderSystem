package com.lemontree0802.command;

import com.lemontree0802.mapper.AdministratorMapper;
import com.lemontree0802.mapper.MerchantMapper;
import com.lemontree0802.mapper.UserMapper;
import com.lemontree0802.pojo.Administrator;
import com.lemontree0802.pojo.Merchant;
import com.lemontree0802.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.ArrayList;
import java.util.List;

public class SelectExistCommand {
    private final SqlSessionFactory sqlSessionFactory;

    public SelectExistCommand(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public boolean DoesContainName(String name, String identity) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            List<String> names = new ArrayList<>();

            if (identity.equals("student") || identity.equals("employee")) {
                UserMapper mapper = session.getMapper(UserMapper.class);
                List<User> users = mapper.selectAll();
                for (User user : users) {
                    names.add(user.getName());
                }
            } else if (identity.equals("administrator")) {
                AdministratorMapper mapper = session.getMapper(AdministratorMapper.class);
                List<Administrator> administrators = mapper.selectAll();
                for (Administrator administrator : administrators) {
                    names.add(administrator.getName());
                }
            } else {
                MerchantMapper mapper = session.getMapper(MerchantMapper.class);
                List<Merchant> merchants = mapper.selectAll();
                for (Merchant merchant : merchants) {
                    names.add(merchant.getName());
                }
            }
            return names.contains(name);
        }
    }
}
