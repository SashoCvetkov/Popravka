package testOOP.poravka6;

public class WebPacket extends Packet implements Comparable {
    //Добавете полета - IP адрес на изпращач и IP адрес на получател
    public String ipIzprashach;
    public String ipPoluchatel;

    public WebPacket(int id, String data, String ipIzprashach, String ipPoluchatel) {
        super(id, data);
        this.ipIzprashach = ipIzprashach;
        this.ipPoluchatel = ipPoluchatel;
    }

    @Override
    public void printData() {
        System.out.println(String.format("ID of package: %d, Send of: %s, Received from: %s, Data is %s",
                id, ipIzprashach, ipPoluchatel, data));
    }

    @Override
    public int compareTo(Object webPacket) {
        WebPacket other = (WebPacket) webPacket;
        if(this.id < other.id){
            return -1;
        }else if(this.id > other.id){
            return 1;
        }
        return 0;
    }
}
