package org.example.commands;

public class DepositCommand extends Command {
    private String arguments;

    public DepositCommand(String argument) {
        super("deposit");
        this.arguments = argument;
        System.out.println("Deposit command executed");
    }
}
