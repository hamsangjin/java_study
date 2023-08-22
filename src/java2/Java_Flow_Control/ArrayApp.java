package java2.Java_Flow_Control;

public class ArrayApp {
    public static void main(String[] args) {
        // egoing, jinhuck, youbin

        // 문자열로 세 개의 이름 저장
        // String users = "egoing, jinhuck, youbin";

        // for문을 사용하지 않고 배열로 세 개의 이름 저장
        String[] users = new String[3];
        users[0] = "egoing";
        users[1] = "jinhuck";
        users[2] = "youbin";

        System.out.println(users[1]);                   // users 배열의 두 번째 요소 출력
        System.out.println(users.length);               // users 배열의 길이

        // 정의할 때 값까지 같이 정의하는 방법
        int[] scores = {10, 100, 100};

        System.out.println(scores[1]);                  // scores 배열의 두 번째 요소 출력
        System.out.println(scores.length);              // scores 배열의 길이

    }
}
