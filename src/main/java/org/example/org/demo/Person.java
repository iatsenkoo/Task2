package org.example.org.demo;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void takeCredit(){
        System.out.println("человек берет кредит в банке");
    }

    public void giveDeposit(){
        System.out.println("человек ложит депозит в банк");
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
