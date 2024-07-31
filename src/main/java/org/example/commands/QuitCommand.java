package org.example.commands;

public class QuitCommand extends Command {
    public QuitCommand() {
        super("quit");
        System.out.println("Quit Command execute");
    }
}
