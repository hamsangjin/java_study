package java2.Java_Flow_Control;

public class IFApp {
    public static void main(String[] args) {
        System.out.println("a");

        // if문의 조건문의 true/false에 따라 {} 안에 내용의 출력 유무 결정
        // if - else
        if(false) {
            System.out.println(1);
        } else {
            if (true) {
                System.out.println(2);
            } else {
                System.out.println(3);
            }
        }

        // if - else if - else
        if(false) {
            System.out.println(1);
        } else if (true){
            System.out.println(2);
        } else {
            System.out.println(3);
        }

        System.out.println("b");

    }
}
