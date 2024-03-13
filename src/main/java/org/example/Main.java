package org.example;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("VW","Polo","Rot",1994, 200, 0);
        car.startCar();
        car.accelerateCar(50);

        Person person = new Person("Bastian", 27, "male");
        person.introduction();

    }

}