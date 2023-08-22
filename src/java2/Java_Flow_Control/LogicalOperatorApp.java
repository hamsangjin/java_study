package java2.Java_Flow_Control;

public class LogicalOperatorApp {
    public static void main(String[] args) {

        // And(&&) = 그리고
        System.out.println(1 == 1);                         // true
        System.out.println(true && true);                   // true
        System.out.println(true && false);                  // false
        System.out.println(false && true);                  // false
        System.out.println(false && false);                 // false

        // Or(||) = 이거나
        System.out.println(true || true);                   // true
        System.out.println(true || false);                  // true
        System.out.println(false || true);                  // true
        System.out.println(false || false);                 // false

        // Not(!) = 반대
        System.out.println(!true);                          // false
        System.out.println(!false);                         // true

    }
}
