package com.lemontree0802;

import com.lemontree0802.command.SelectExistCommand;
import com.lemontree0802.command.InfoCommand;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.HashSet;
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
        HashSet<String> identityType = new HashSet<>();
        identityType.add("student");
        identityType.add("employee");
        identityType.add("merchant");
        identityType.add("administrator");

        String name = null;
        String identity = null;

        Scanner scanner = new Scanner(System.in);

        boolean haveChosenType = false;
        boolean haveLoggedIn = false;
        while (true) {
            if (!haveChosenType) {
                System.out.println("您还没登录，请选择您的身份（student, employee, merchant, administrator)：");
            }
            while (!haveChosenType) {
                identity = scanner.nextLine();
                if (identityType.contains(identity)) {
                    haveChosenType = true;
                } else {
                    System.out.println("无效的身份名称，请重新输入：");
                }
            }

            while (!haveLoggedIn) {
                System.out.println("请输入您的名称：");
                name = scanner.nextLine();

                SelectExistCommand selectExistCommand = new SelectExistCommand(sqlSessionFactory);
                if (selectExistCommand.DoesContainName(name, identity)) {
                    System.out.println("登录成功！");
                    haveLoggedIn = true;
                } else {
                    System.out.println("用户不存在！");
                }
            }


            System.out.println("请输入命令：");
            String command = scanner.nextLine();
            switch (command) {
                case "exit" -> {
                    scanner.close();
                    System.out.println("退出程序");
                    return;
                }
                case "my info" -> { // 显示我的信息
                    InfoCommand infoCommand = new InfoCommand(sqlSessionFactory);
                    infoCommand.execute(identity, name);
                }
                case "log out" -> { // 登出
                    haveChosenType = false;
                    haveLoggedIn = false;
                }
                default -> System.out.println("无效命令");
            }
        }







    }
}

