package org.example;

import org.example.commands.Command;

import java.util.Scanner;

public class App {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String userInput;

        boolean running = true;
        while (running) {
            userInput = getUserInput();

            if (!userInput.equals("quit")) {
                Command command = new Command(userInput);
                command.createCommand();
            } else {
                System.out.println("Application Shutting Down . . .");
                running = false;
            }

        }
//        AbstractAccount test1 = new StudentAccount("Kyle","9908025117081");
//        System.out.println(test1.toString());
    }

    private static String getUserInput() {
        System.out.println("Please enter a command:");
        return scanner.nextLine();
    }
}