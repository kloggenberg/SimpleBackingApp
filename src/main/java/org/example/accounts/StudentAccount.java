package org.example.accounts;

public class StudentAccount extends AbstractAccount {
    private final String accountType = "Student Account";

    public StudentAccount(String name, String id) {
        super(name, id);
    }

    @Override
    public String getType() {
        return accountType;
    }

    @Override
    public String toString() {
        return "Account Holder: " + getFullName()
                + "\nAccount Number: " + getIDNumber()
                + "\nBalance: R" + getBalance()
                + "\nAccount Type: " + getType();
    }
}
