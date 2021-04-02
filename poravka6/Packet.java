package testOOP.poravka6;

abstract public class Packet {
    public int id;
    public String data;

    public Packet(int id, String data) {
        this.id = id;
        this.data = data;
    }

    abstract public void printData();
}
