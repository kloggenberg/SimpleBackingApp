package org.example.commands;

public class ErrorCommand  extends Command {
    public ErrorCommand() {
        super("error");
        System.out.println("Error command executed");
    }
}
