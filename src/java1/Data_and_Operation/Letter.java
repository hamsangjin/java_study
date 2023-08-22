package java1.Data_and_Operation;
public class Letter {
    public static void main(String[] args) {

        // 간단한 출력문에 문자열을 사용해 유지보수를 쉽게 할 수 있음
        // 이건 크기가 더 커질 수록 유지보수할 때 더 좋음
        String name = "leezche";
        System.out.println("Hello, " + name + " ... " + name + " ... " + name + " ... bye");

        // 그냥 System.out.println(10); 하는 것보단 저렇게 변수를 이용해 하는 것이
        // 다른 사람이 코드를 읽었을 때 숫자의 의미를 알 수 있음
        double VAT = 10.0;
        System.out.println(VAT);

    }
}
