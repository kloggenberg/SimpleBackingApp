package org.example.accounts;

import java.util.Random;

public abstract class AbstractAccount {
    private String idNumber;
    private String fullName;
    private String accountNumber;
    private float balance = 0.0f;
    private Random random = new Random();

    public AbstractAccount(String name, String idNumber){
        this.fullName = name;
        this.idNumber = idNumber;
        System.out.println("Account for " + fullName + " has been created.");
    }

    public float getBalance() {
        return balance;
    }

    private void changeBalance(float amount){
        this.balance += amount;
    }

    private void createID(){

    }

    public String getIDNumber(){
        return idNumber;
    }

    public String getFullName() {
        return fullName;
    }

    private String getAccountNumber() {
        return accountNumber;
    }


    public abstract String getType();
}
