package com.company.creatures;

public class Animal {

    public String species;
    private Double weight;
    public String name;
    Boolean alive;

    public Double getWeight() {
        return this.weight;
    }

    public Animal(String species) {
        this.species = species;
        alive = true;

        if (this.species == "Cocker") {
            this.weight = 10.0;
        } else if (this.species == "dachowiec") {
            this.weight = 6.0;
        }

    }

    public void feed() {
        if (this.weight > 0) {

            this.weight++;
            System.out.println("Waga zwierzaka po nakarmieniu wynosi: " + weight + " kg");

        } else if (this.weight <= 0.0) {
            System.out.println("Przykro mi " + name + " zdechła, nie nakarmisz zdechłego zwierzaka");


        }
    }

    public void takeForAWalk() {
        if (this.weight > 0) {

            this.weight--;
            System.out.println("Zwierzak poszedl na spacer, jego waga wynosi: " + weight + " kg");
        } else if (this.weight == 0) {
            System.out.println("Niestety " + name + " zdechła, nie wyprowadzisz zdechłego zwierzaka");


        }

    }
}
