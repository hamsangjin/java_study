package java1.MyApp;

class Accounting{
    public double valueOfSupply;
    public double vatRate;
    public double expenseRate;

    // ------ 아래에 정의된 메소드 ------
    public void print() {
        System.out.println("Value of supply : " + valueOfSupply);           // 공급가
        System.out.println("VAT : " + getVAT());                            // 부가세
        System.out.println("Total : " + getTotal());                        // 최종 가격
        System.out.println("Expense : " + getExpense());                    // 비용
        System.out.println("Income : " + getIncome());                      // 이익
        System.out.println("Dividend 1: " + getDividend1());                // 첫 번째 사람 배당금
        System.out.println("Dividend 2: " + getDividend2());                // 두 번째 사람 배당금
        System.out.println("Dividend 3: " + getDividend3());                // 세 번째 사람 배당금
    }
    public double getDividend1() {
        return getIncome() * 0.5;
    }
    public double getDividend2() {
        return getIncome() * 0.3;
    }
    public double getDividend3() {
        return getIncome() * 0.2;
    }
    public double getIncome() {
        return valueOfSupply - getExpense();
    }
    public double getExpense() {
        return valueOfSupply * expenseRate;
    }
    public double getTotal() {
        return valueOfSupply + getVAT();
    }

    // 만약 VAT를 계산하는 식이 엄청 길었다면 위 코드에서 지저분하므로
    // 아래처럼 메소드를 정의해 값을 저장해준다.
    public double getVAT() {
        return valueOfSupply * vatRate;
    }
}

// Accounting1, 2
//class Accounting1{
//    public static double valueOfSupply;
//    public static double vatRate;
//    public static double expenseRate;
//
//    // ------ 아래에 정의된 메소드 ------
//    public static void print() {
//        System.out.println("Value of supply : " + valueOfSupply);           // 공급가
//        System.out.println("VAT : " + getVAT());                            // 부가세
//        System.out.println("Total : " + getTotal());                        // 최종 가격
//        System.out.println("Expense : " + getExpense());                    // 비용
//        System.out.println("Income : " + getIncome());                      // 이익
//        System.out.println("Dividend 1: " + getDividend1());                // 첫 번째 사람 배당금
//        System.out.println("Dividend 2: " + getDividend2());                // 두 번째 사람 배당금
//        System.out.println("Dividend 3: " + getDividend3());                // 세 번째 사람 배당금
//    }
//    public static double getDividend1() {
//        return getIncome() * 0.5;
//    }
//    public static double getDividend2() {
//        return getIncome() * 0.3;
//    }
//    public static double getDividend3() {
//        return getIncome() * 0.2;
//    }
//    public static double getIncome() {
//        return valueOfSupply - getExpense();
//    }
//    public static double getExpense() {
//        return valueOfSupply * expenseRate;
//    }
//    public static double getTotal() {
//        return valueOfSupply + getVAT();
//    }
//
//    // 만약 VAT를 계산하는 식이 엄청 길었다면 위 코드에서 지저분하므로
//    // 아래처럼 메소드를 정의해 값을 저장해준다.
//    public static double getVAT() {
//        return valueOfSupply * vatRate;
//    }
//}
//
//class Accounting2{
//    public static double valueOfSupply;
//    public static double vatRate;
//    public static double expenseRate;
//
//    // ------ 아래에 정의된 메소드 ------
//    public static void print() {
//        System.out.println("Value of supply : " + valueOfSupply);           // 공급가
//        System.out.println("VAT : " + getVAT());                            // 부가세
//        System.out.println("Total : " + getTotal());                        // 최종 가격
//        System.out.println("Expense : " + getExpense());                    // 비용
//        System.out.println("Income : " + getIncome());                      // 이익
//        System.out.println("Dividend 1: " + getDividend1());                // 첫 번째 사람 배당금
//        System.out.println("Dividend 2: " + getDividend2());                // 두 번째 사람 배당금
//        System.out.println("Dividend 3: " + getDividend3());                // 세 번째 사람 배당금
//    }
//    public static double getDividend1() {
//        return getIncome() * 0.5;
//    }
//    public static double getDividend2() {
//        return getIncome() * 0.3;
//    }
//    public static double getDividend3() {
//        return getIncome() * 0.2;
//    }
//    public static double getIncome() {
//        return valueOfSupply - getExpense();
//    }
//    public static double getExpense() {
//        return valueOfSupply * expenseRate;
//    }
//    public static double getTotal() {
//        return valueOfSupply + getVAT();
//    }
//
//    // 만약 VAT를 계산하는 식이 엄청 길었다면 위 코드에서 지저분하므로
//    // 아래처럼 메소드를 정의해 값을 저장해준다.
//    public static double getVAT() {
//        return valueOfSupply * vatRate;
//    }
//}


public class AccountingClassApp {
    public static void main(String[] args) {
        // Accounting 클래스에 메소드들과 전역 변수들은 넘김으로써
        // 더 직관적이고 편리하게 코드 작성이 가능하다.
//        Accounting.valueOfSupply = 10000.0;
//        Accounting.vatRate = 0.1;
//        Accounting.expenseRate = 0.3;
//        Accounting.print();

        // 다른 값이 들어오면 이렇게 변수들을 다시 세팅해주고 메소드를 호출해야한다.
        // 만약 이런 과정이 빈번하게 일어난다면 클래스 내부적인 코드를 수정하는 게 버그를 발생시킬 수 있다.
        // 따라서 클래스를 복제해 사용할 수 있다.
//        Accounting1.valueOfSupply = 10000.0;
//        Accounting1.vatRate = 0.1;
//        Accounting1.expenseRate = 0.3;
//        Accounting1.print();
//
//        Accounting2.valueOfSupply = 20000.0;
//        Accounting2.vatRate = 0.05;
//        Accounting2.expenseRate = 0.2;
//        Accounting2.print();


        // 위처럼 클래스를 복제할 수 있지만 클래스를 복제하지 않고 인스턴스를 생성해 사용할 수 있다.
        // 대신 정의된 변수와 메소드는 정적(static) 선언을 제거해야한다.
        Accounting a1 = new Accounting();
        a1.valueOfSupply = 10000.0;
        a1.vatRate = 0.1;
        a1.expenseRate = 0.3;

        Accounting a2 = new Accounting();
        a2.valueOfSupply = 20000.0;
        a2.vatRate = 0.05;
        a2.expenseRate = 0.3;

        a1.print();
        a2.print();

    }
}
