package java2.Java_Flow_Control;

public class EqualsApp {
    public static void main(String[] args) {
        int p1 = 1;
        int p2 = 1;

        System.out.println(p1 == p2);       // 주소를 같은 곳을 가리키고 있으므로 true

        // 이런 식으로 문자열 정의 시 다른 주소를 가리킴
        String o1 = new String("java");
        String o2 = new String("java");

        System.out.println(o1 == o2);       // 주소를 다른 곳을 가리키고 있으므로 false

        // 이건 문자열을 비교하는 것이므로 true
        System.out.println(o1.equals(o2));
        System.out.println(o2.equals(o1));

        // 이런 식으로 문자열 정의 시 같은 주소를 가리킴
        String o3 = "java2";
        String o4 = "java2";

        // 정리
        // 원시데이터 타입은 비교 연산자 사용
        // 원시데이터 타입이 아닌 것은 equals 사용

    }
}
