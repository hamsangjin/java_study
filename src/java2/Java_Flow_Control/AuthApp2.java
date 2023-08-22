package java2.Java_Flow_Control;

public class AuthApp2 {
    public static void main(String[] args) {

        String id = "egoing";
        String inputId = args[0];

        // 한 유저가 패스워드를 두 개 가지고 있다고 가정
        String pass1 = "123456";
        String pass2 = "654321";

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

        // boolean 타입의 변수에 비밀번호가 맞는가에 대한 true/false 유무 저장
        boolean isRigthPass = (inputPass.equals(pass1) || inputPass.equals(pass2));

        // 위의 코드를 논리 연산자를 이용해 간략화, 약간 다름
        // Or문을 추가해 첫 번째 패스워드가 틀려도 두 번째 패스워드가 맞다면 "Master !" 출력해줌
        if (inputId.equals(id) && isRigthPass){
            System.out.println("Master !");
        } else {
            System.out.println("Who are you?");
        }



    }
}
