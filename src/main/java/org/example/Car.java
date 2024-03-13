package org.example;

public class Car {

    String brand;
    String model;
    String color;
    int YearOfManufacture;
    int speed;
    int newSpeed;


    public Car(String brand, String model, String color, int YearOfManufacture, int speed, int newSpeed){

        this.brand = brand;
        this.model = model;
        this.color = color;
        this.YearOfManufacture = YearOfManufacture;
        this.speed = speed;
        this.newSpeed = newSpeed;

    }

    public Car(){
        
    }

    public void startCar(){

        System.out.println(
                "The " + color + " " + brand + " " + model + " from " +  YearOfManufacture + " starts!" + " the speed is: " + speed
        );

    }

    public void accelerateCar(int accelerate){

        newSpeed = speed + accelerate;
        System.out.println("The speed is now: " + newSpeed + " the old speed was: " + speed);

    }


}
