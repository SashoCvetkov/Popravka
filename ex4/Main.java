package testOOP.ex4;

public class Main {
    public static void main(String arg[])
        {
            Car car = new Car("Car", "Opel", 4, 2);
            Truck truck = new Truck("Truck", "TruckModel", 8, 350);

            car.PrintInfo();
            System.out.println();
            truck.PrintInfo();

        }

}
