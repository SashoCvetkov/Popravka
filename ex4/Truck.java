package testOOP.ex4;

    class Truck extends Vehicle {
        public int weightMax;

        public Truck(String brand, String model, int wheels, int weightMax) {
            super(brand, model, wheels);
            this.weightMax = weightMax;
        }


        @Override
        public void PrintInfo() {

            System.out.printf("Brand: %s%n" , brand);
            System.out.printf("Model: %s%n" , model);
            System.out.printf("Wheels: %d%n" , wheels);
            System.out.printf("Weight limit (tons): %d%n" , weightMax);
        }

}
