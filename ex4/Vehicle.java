package testOOP.ex4;

public abstract class Vehicle {

    public String brand;
    public String model;
    public int wheels;

    public Vehicle(String brand, String model, int wheels) {
        this.brand = brand;
        this.model = model;
        this.wheels = wheels;
    }

    public abstract void PrintInfo();
}









