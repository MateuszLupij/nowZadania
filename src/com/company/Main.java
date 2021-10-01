package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("Cocker");
        dog.name = "Luna";
        System.out.println("Pies nazywa się: " + dog.name);
        System.out.println(dog.name + " waży: " + dog.getWeight() + " kg");

        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        dog.feed();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();


        Animal cat = new Animal("dachowiec");
        cat.name = "Kika";
        System.out.println("Kot nazywa się: " + cat.name);
        System.out.println("Kot waży: " + cat.getWeight() + " kg");
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();
        cat.feed();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.takeForAWalk();
        cat.feed();


        Human me = new Human();

        me.sex = "men";
        me.FirstName = "Mateusz";
        me.LastName = "Lupij";
        me.age = 29;
        me.introduceYourself();


        Human myWife = new Human();
        myWife.FirstName = "Agnieszka";
        myWife.LastName = "xx";
        myWife.introduceYourself();
        me.setSalary(21.000);
        me.pet = dog;

        Car vehicle = new Car("opel", "silver", "vectra", 20.000);
        Car vehicle1 = new Car("opel", "silver", "vectra", 20.000);
        me.setVehicle(vehicle);

        System.out.println(vehicle.equals(vehicle1));
        System.out.println(me);
        System.out.println(vehicle);


    }
}
