package org.example.commands;

public class DepositCommand extends Command {
    private String arguments;

    public DepositCommand(String argument) {
        super("deposit");
        this.arguments = argument;
    }

    @Override
    public void execute() {
        System.out.println("Deposit command executed");
    }
}
