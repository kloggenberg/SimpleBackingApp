package org.example.commands;

public class QuitCommand extends Command {
    public QuitCommand() {
        super("quit");
    }

    @Override
    public void execute() {
        System.out.println("Quit Command execute");
    }
}
