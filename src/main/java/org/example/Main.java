package org.example;

import org.example.org.demo.*;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        System.out.println("Создаем объект класса");
        Animal animal = new Animal("Tiger", 4);
        System.out.println("animal = " + animal);

        System.out.println("получаем свойства класса");
        System.out.println("animal name = " + animal.getName());
        System.out.println("animal age = " + animal.getAge());

        BankOperation bankOperation = new Bank(new Person("Ivan",36));
        bankOperation.createOperation();

        Car car = new Car();
        car.transferPassengers();
        car.move();

        int id = 3;
        BigObject bigObject = new BigObject();
        bigObject.setId(id);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(bigObject);
        objectOutputStream.close();

        byte [] bufer = byteArrayOutputStream.toByteArray();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bufer);
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        BigObject bigObject1 = (BigObject) objectInputStream.readObject();
        if (bigObject1.getId() == id){
            System.out.println("originalId equals copiedId");
        }
    }
}