package java2.Java_Flow_Control;

public class AuthApp {
    public static void main(String[] args) {

        String id = "egoing";
        String inputId = args[0];

        String pass = "123456";
        String inputPass = args[1];

        System.out.println("Hi.");

        // 이렇다면 else문이 실행됨 왜 ?
//        if (inputId == id){
//            System.out.println("Master !");
//        } else {
//            System.out.println("Who are you?");
//        }

        // ==와 같은 비교 연산자는 다른 데이터형과는 달리
        // 문자열과 같은 객체에서는 의도치 않은 결과를 제공해줌
        // 따라서 문자열을 비교할 때는 equals 메소드를 사용해야함
//        if (inputId.equals(id)){
//            if (inputPass.equals(pass)) {
//                System.out.println("Master !");
//            } else {
//                System.out.println("Wrong password");
//            }
//        } else {
//            System.out.println("Who are you?");
//        }

        // 위의 코드를 논리 연산자를 이용해 간략화, 약간 다름
        if (inputId.equals(id) && inputPass.equals(pass)){
            System.out.println("Master !");
        } else {
            System.out.println("Who are you?");
        }



    }
}
