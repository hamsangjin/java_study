package java2.ProjectMethod;

class Greeting{
    // public, protected, default, private

    public static void hi(){
        System.out.println("hi");
    }
}

public class AccessLevelModifiersMethod {

    public static void main(String[] args) {
        // private : 같은 클래스 안에서만 메소드 사용 가능하며
        // 현재는 Public이라 사용가능
        Greeting.hi();
    }
}