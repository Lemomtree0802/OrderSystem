package com.lemontree0802.command;

import java.util.HashMap;
import java.util.Map;

public class CommandManager {
    private final Map<String, Command> commandMap = new HashMap<>();

    public void register(String commandName, Command command) {
        commandMap.put(commandName, command);
    }

    public void execute(String commandName) {
        Command command = commandMap.get(commandName);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("未知命令: " + commandName);
        }
    }
}

