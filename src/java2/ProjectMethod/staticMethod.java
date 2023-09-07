package java2.ProjectMethod;

class Print{
    public String delimiter;

    // static을 제거하면서
    // instance만 사용이 가능해졌음
    public void a(){
        System.out.println(this.delimiter);
        System.out.println("a");
        System.out.println("a");
    }

    public void b(){
        System.out.println(this.delimiter);
        System.out.println("b");
        System.out.println("b");
    }

    // 이건 static이므로 클래스로 호출 가능
    public static void c(String delimiter){
        System.out.println(delimiter);
        System.out.println("b");
        System.out.println("b");
    }

}

public class staticMethod {
    public static void main(String[] args) {
        // static - class method
        // no static - instance method

        // Print.a("-");
        // Print.b("-");

        // 위에 인자를 자유롭게 다루기 위해 복제
        // t1에 class 복제 -> instance라고 함
        Print t1 = new Print();

        t1.delimiter = "-";
        t1.a();
        t1.b();

        Print t2 = new Print();

        t2.delimiter = "*";
        t2.a();
        t2.b();

        // c는 클래스 호출이 가능한 걸 볼 수 있음.
        Print.c("-");
    }
}
