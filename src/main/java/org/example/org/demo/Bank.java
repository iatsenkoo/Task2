package org.example.org.demo;

public class Bank implements BankOperation{
    private Person person;

    public Bank(Person person) {
        this.person = person;
    }

    @Override
    public void createOperation() {
        this.person.takeCredit();
        this.person.giveDeposit();
    }
}
