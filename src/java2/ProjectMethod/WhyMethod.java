package java2.ProjectMethod;

import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

    public static void printTwoTimesA(){
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");
    }

    public static void printTwoTimesB(){
        System.out.println("-");
        System.out.println("B");
        System.out.println("B");
    }
    // text와 delimiter와 같은 변수들 : 매개변수(메소드 내용과 매개해주는 변수) - parameter
    public static void printTwoTimes(String text, String delimiter){
        System.out.println(delimiter);
        System.out.println(text);
        System.out.println(text);
    }

    public static void writeFileTwoTimes(String text, String delimiter) throws IOException{
        FileWriter fw = new FileWriter("output.txt");
        fw.write(delimiter + "\n");
        fw.write(text + "\n");
        fw.write(text + "\n");
        fw.close();
    }

    public static String twoTimes(String text, String delimiter){
        String out = "";
        out = out + delimiter + "\n";
        out = out + text + "\n";

        return out;
    }

    public static void main(String[] args) throws IOException {

        // 1억 개의 줄이 있다고 가정했을 때
        // 아래처럼 작성했을 경우 수정이 어려움
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");

        // 1억줄 ...
        System.out.println("-");
        System.out.println("A");
        System.out.println("A");


        // 메소드를 사용해 편리하게 호출
        // 이렇게 메소드로 변경하려면
        // 메소드에 추가할 코드를 드래그 한 후 refactor -> Extract Method
        printTwoTimesA();
        printTwoTimesA();

        // 아래처럼 B를 출력하고 싶다면 새로운 메소드를 만들어야 함
        printTwoTimesB();

        // 그래서 입력값에 따라 다른 출력값을 내는 메소드를 생성
        // A나 !와 같은 값들 : 인자 - argument
        printTwoTimes("A", "!");

        System.out.println(twoTimes("a", "-"));

        writeFileTwoTimes("a", "*");
        FileWriter fw = new FileWriter("out.txt");
        fw.write(twoTimes("a", "*"));
        fw.close();

        printTwoTimes("a", "&");

        // Email.send("rhkstlash@naver.com", "two times a", twoTimes("a", "&"));

    }
}
