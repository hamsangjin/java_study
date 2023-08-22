package java1.Programming;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InstanceApp {
    public static void main(String[] args) throws FileNotFoundException {
        // 클래스 관계 : Object를 상속한 Writer를 상속한 PrintWriter
        // class Object                 -> 많이 쓰이는 클래스이므로 안에 들어있는 메소드는 한 번 읽어보면 좋음
        // class Writer extends Object
        // class PrintWriter extends Writer

        // PrintWriter p1 = new PrintWriter("result 1.txt")
        // p1.toString()

        // 만약 toString() 메소드가 object 클래스에 있다고 하면
        // 먼저 본인 클래스인 PrintWriter에서 찾아보고 그 위의 부모 클래스인 Writer 클래스에서 찾아본다.
        // Writer에도 해당 메소드가 존재하지 않으면 그 위의 부모 클래스인 object 클래스에서 찾아본다.
        // 만약 object 클래스에도 없다면 더이상 찾을 곳이 없으므로 오류가 발생하고 있다면 해당 메소드가 실행된다.

        // 만약 Writer 클래스에 write라는 메소드가 있는데
        // PrintWriter 클래스에선 좀 변경해서 사용하고 싶다면
        // PrintWriter 클래스에서 write 메소드를 다시 정의해 사용할 수 있다.
        // 이것을 overriding이라고 한다.

        PrintWriter p1 = new PrintWriter("/Users/sangjin/Desktop/java_study/java_study/src/java1/Programming/result1.txt");
        p1.write("Hello 1");
        p1.close();

        PrintWriter p2 = new PrintWriter("/Users/sangjin/Desktop/java_study/java_study/src/java1/Programming/result2.txt");
        p2.write("Hello 2");
        p2.close();

        // PrintWriter.write("result1.txt", "Hello 1");
        // PrintWriter.write("result2.txt", "Hello 2");
        // 위와 같은 방법으로는 PrintWriter를 사용할 수 없다.
        // 또 이렇게 사용했을 땐 입력할 때마다 어디 파일에 작성할지 정해줘야해 효율적이지 못하다.
        // Math 클래스와 같이 일회성 사용이 아닌 다회성 사용 클래스는 import해 인스턴스를 만들어서 사용하는 게 효율적일 수 있다.

    }
}