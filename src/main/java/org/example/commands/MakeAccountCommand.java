package org.example.commands;

public class MakeAccountCommand extends Command {
    private String arguements;

    public MakeAccountCommand(String arguements) {
        super("make");
        this.arguements = arguements;
    }

    @Override
    public void execute() {
        System.out.println("MakeAccount Command executed");
    }
}
