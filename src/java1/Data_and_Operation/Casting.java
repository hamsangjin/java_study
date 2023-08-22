package java1.Data_and_Operation;

public class Casting {
    public static void main(String[] args) {
        double a = 1.1;
        // double에 정수형을 저장해도 실수형으로 변환되어 저장됨
        // double b = (double) 1; 과 동일
        double b = 1;
        System.out.println(b);

        // 아래 코드는 정수형에 실수형을 저장해 오류가 발생한다.
        // int c = 1.1;

        // int형에 실수를 저장할 땐 (int)를 이용해 정수형으로 변환 후 저장할 수 있음
        int c = (int) 1.1;
        System.out.println(c);

        // int 1 to String 1 변환
        String d = Integer.toString(1);
        // .getclass() : 이 변수가 어떤 데이터타입인지 알려줌
        System.out.println(d.getClass());
    }
}
