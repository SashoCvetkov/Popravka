package testOOP.ex5;

public class Spаrrow implements IBird{
    private String name;

    public Spаrrow(String name) {
        this.name = name;
    }


    @Override
    public void sleep() {
        System.out.printf("%s is sleeping%n", name);
    }

    @Override
    public void eat() {
        System.out.printf("%s is eating%n", name);
    }

    @Override
    public void walk() {
        System.out.printf("%s is walking%n", name);
    }

    @Override
    public void fly() {
        System.out.printf("%s is flying%n", name);
    }
}
