package java1.Data_and_Operation;

public class StringApp {
    public static void main(String[] args) {

        // Character vs String
        System.out.println("Hello World");              // String = 문자열 = Character(문자)들의 모음
      //System.out.println('Hello World');              // java에서 ''는 Character 타입을 가리킴 (한 글자)

        // 이런 식의 줄바꿈은 java에서 허용하지 않음
        // System.out.println("Hello
        //        World");


        // 따옴표와 +를 이용하면 줄바꿈을 해 작성 가능
        // 실제 출력엔 줄바꿈이 일어나지 않음
        System.out.println("Hello " +
                "World");

        // 출력에 줄바꿈을 일어나게 하려면 \n을 이용해 줄바꿈을 할 수 있다
        System.out.println("Hello \nWorld");

        // Hello "World" 출력하기
        // \를 이용해 특수문자도 출력 가능
        // 이걸 escape라고 함
        System.out.println("Hello \"World\"");

    }
}
