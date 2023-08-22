package java1.MyApp;

public class AccountingMethodApp {

    // valueOfSupply, vatRate, expenseRate 전역변수 선언
    public static double valueOfSupply;
    public static double vatRate;
    public static double expenseRate;
    public static void main(String[] args) {
        valueOfSupply = 10000.0;
        vatRate = 0.1;
        expenseRate = 0.3;

        print();
    }

    // ------ 아래에 정의된 메소드 ------
    public static void print() {
        System.out.println("Value of supply : " + valueOfSupply);           // 공급가
        System.out.println("VAT : " + getVAT());                            // 부가세
        System.out.println("Total : " + getTotal());                        // 최종 가격
        System.out.println("Expense : " + getExpense());                    // 비용
        System.out.println("Income : " + getIncome());                      // 이익
        System.out.println("Dividend 1: " + getDividend1());                // 첫 번째 사람 배당금
        System.out.println("Dividend 2: " + getDividend2());                // 두 번째 사람 배당금
        System.out.println("Dividend 3: " + getDividend3());                // 세 번째 사람 배당금
    }

    public static double getDividend1() {
        return getIncome() * 0.5;
    }
    public static double getDividend2() {
        return getIncome() * 0.3;
    }
    public static double getDividend3() {
        return getIncome() * 0.2;
    }

    public static double getIncome() {
        return valueOfSupply - getExpense();
    }

    public static double getExpense() {
        return valueOfSupply * expenseRate;
    }

    public static double getTotal() {
        return valueOfSupply + getVAT();
    }

    // 만약 VAT를 계산하는 식이 엄청 길었다면 위 코드에서 지저분하므로
    // 아래처럼 메소드를 정의해 값을 저장해준다.
    public static double getVAT() {
        return valueOfSupply * vatRate;
    }
}
