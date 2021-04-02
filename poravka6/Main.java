package testOOP.poravka6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<WebPacket> webPackeges = new ArrayList<>();
        WebPacket webPacket1 = new WebPacket(1, "pratka", "212.134.90.18", "22");
        WebPacket webPacket2 = new WebPacket(2, "pratka1111", "212.134.90.33", "212.134.90.18");
        WebPacket webPacket3 = new WebPacket(3, "pratka222222", "212.134.90.43", "212.134.90.0");
        WebPacket webPacket4 = new WebPacket(4, "pratka33", "212.134.90.87", "212.134.90.8");
        webPackeges.add(webPacket3);
        webPackeges.add(webPacket1);
        webPackeges.add(webPacket4);
        webPackeges.add(webPacket2);
        Collections.sort(webPackeges);

        //Принтираме сортираните данни
        for (WebPacket webPackege : webPackeges) {
            webPackege.printData();
        }
        //Принтираме данните от пратките, при които имаме IP 212.134.90.18 или при получатели или при изпратилия пратката
        for (WebPacket webPackege1 : webPackeges) {
            if (webPackege1.ipPoluchatel.equals("212.134.90.18") || webPackege1.ipIzprashach.equals("212.134.90.18")) {
                System.out.println(webPackege1.data);
            }
        }
    }
}
