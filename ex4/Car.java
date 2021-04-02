package testOOP.ex4;

class Car extends Vehicle {
    private int doors;

    public Car(String brand, String model, int wheels, int doors) {
        super(brand, model, wheels);
        this.doors = doors;
    }


    @Override
    public void PrintInfo() {
        System.out.printf("Brand: %s%n" , brand);
        System.out.printf("Model: %s%n" , model);
        System.out.printf("Doors: %d%n" , wheels);
        System.out.printf("Wheels: %d%n" , wheels);


    }
}