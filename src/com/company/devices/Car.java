package com.company.devices;

import java.util.Objects;

public class Car {

    final String producer;
    String color;
    final String model;
    public Double value;


    public Car(String producer, String color, String model, Double price) {
        this.producer = producer;
        this.color = color;
        this.model = model;
        this.value = price;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(producer, car.producer) && Objects.equals(color, car.color) && Objects.equals(model, car.model) && Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, color, model, value);
    }

    @Override
    public String toString() {
        return "Car{" +
                "producer='" + producer + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", value=" + value +
                '}';
    }
}
