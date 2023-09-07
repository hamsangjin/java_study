package java2.ProjectMethod;

public class OutputMethod {

    // void는 return 값 x
    // return 값 있을 경우 return 값의 자료형 작성

    // return을 하면 메소드가 종료됨
    // return 뒤에 무슨 코드를 적어도 실행 X
    public static String a(){
        return "a";
    }

    public static int one(){
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(a());
        System.out.println(one());
    }
}
