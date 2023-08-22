package java1.Programming;

import java1.org.opentutorials.iot.Elevator;
import java1.org.opentutorials.iot.Lighting;
import java1.org.opentutorials.iot.Security;

public class OkJavaGoInHome {
    public static void main(String[] args) {

        // 내가 집을 갈 때 하고 싶은 작동들
        String id = "Java APT 507";

        // 1. Elevator Call
        // Java 아파트에 있는 507호 생성됨
        Elevator myElevator = new Elevator(id);
        myElevator.callForUp(1);

        // 2. Security off
        Security mySecurity = new Security(id);
        mySecurity.off();

        // 3. Light on
        Lighting hallLamp = new Lighting(id + " / Hall Lamp");
        hallLamp.on();

        Lighting floorLamp = new Lighting(id + " / floor Lamp");
        floorLamp.on();
    }
}