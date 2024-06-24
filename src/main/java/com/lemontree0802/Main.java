package com.lemontree0802;

import com.lemontree0802.command.CommandManager;
import com.lemontree0802.command.InfoCommand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.Scanner;


public class Main {

    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CommandManager commandManager = new CommandManager();
        commandManager.register("info", new InfoCommand(sqlSessionFactory));

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("请输入命令：");
            String command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("退出程序");
                break;
            }

            commandManager.execute(command);
        }

        scanner.close();
    }
}

