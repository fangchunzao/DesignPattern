package com.factory.command;

/**
 * 控制命令的执行
 */
public class Invoker {

    private Command command;

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
