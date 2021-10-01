package com.company;

import com.company.creatures.Animal;
import com.company.devices.Car;

public class Human {

    String sex;
    String FirstName;
    String LastName;
    Integer age;
    private Double salary;
    Animal pet;
    private Car vehicle;


    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car vehicle) {
        if (salary > vehicle.value) {
            System.out.println("Gratulacje, udało Ci się kupic samochód za gotówkę");
            this.vehicle = vehicle;
            return;
        }
        if (salary > (vehicle.value / 12)) {
            System.out.println("Samochód kosztuje przynajmiej 1/12 Twojego wynagrodzenia, gratulacje udalo CI sie kupic samochod na kredyt");
            this.vehicle = vehicle;
            return;
        }
        System.out.println("Niestety, nie stać Cie na samochód, zapisz się na studia ");


    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Nie można przypisac ujemnej wartosci do wypłaty ! ");
            return;
        }
        System.out.println("Nowe dane został wyslane do ksiegowego. ");
        System.out.println("Prosze stawić się i odebrac aneks do umowy od P. Hani z kadr.");
        System.out.println("ZUS i US zostali poinformowani o zmianie wypłaty, nie ma sensu ukrywać dochodu.");
        this.salary = salary;
    }


    void introduceYourself() {
        System.out.println("My name is " + FirstName);
        System.out.println("My lastname is  " + LastName);
    }
}
