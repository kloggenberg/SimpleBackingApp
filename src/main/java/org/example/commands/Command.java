package org.example.commands;

import java.util.ArrayList;
import java.util.Arrays;

public class Command {
    private ArrayList<String> param;
    private String command;
    private String argument;

    public Command(String command) {
        param = new ArrayList<>(Arrays.asList(command.toLowerCase().trim().split(" ")));;

        this.command = param.get(0);

        if (param.size() > 1) {
            this.argument = param.get(1);
        } else {
            this.argument = "";
        }

    }

    public Command createCommand(){
        return switch (command) {
            case "help" -> new HelpCommand();
            case "deposit" -> new DepositCommand(argument);
            case "make" -> new MakeAccountCommand(argument);
            case "quit", "exit" -> new QuitCommand();
            default -> new ErrorCommand();
        };
    }

    public void execute() {}
}
