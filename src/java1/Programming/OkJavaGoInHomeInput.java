package java1.Programming;

import java1.org.opentutorials.iot.DimmingLights;
import java1.org.opentutorials.iot.Elevator;
import java1.org.opentutorials.iot.Lighting;
import java1.org.opentutorials.iot.Security;

import javax.swing.*;

public class OkJavaGoInHomeInput {
    // args : parameter(매개 변수)
    // config에 미리 입력한 arguments를 args에 저장함
    public static void main(String[] args) {

        // 내가 집을 갈 때 하고 싶은 작동들
        // 팝업 창을 띄워서 시작할 때 id를 입력하게 해 id에 저장시킴
        // showInputDialog는 입력 하나 받음
         String id = JOptionPane.showInputDialog("Enter a ID");
         String bright = JOptionPane.showInputDialog("Enter a Bright");

        // args에 미리 정의한 매개변수를 이용해 변수에 저장하려면 아래와 같이 작성
        // String id = args[0];
        // String bright = args[1];

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

        DimmingLights moodLamp = new DimmingLights(id + " moodLamp");
        moodLamp.setBright(Double.parseDouble(bright));
        moodLamp.on();
    }
}