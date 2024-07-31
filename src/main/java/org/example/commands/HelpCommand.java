package org.example.commands;

public class HelpCommand extends Command {

    public HelpCommand() {
        super("help");
    }

    @Override
    public void execute() {
        System.out.println("Help Command executed");
    }
}
