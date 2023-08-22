package java1.MyApp;

public class AccountingApp {
    public static void main(String[] args) {

        // 1. 기본 기능 구현
//        System.out.println("Value of supply : " + 12345.0);                         // 공급가
//        System.out.println("VAT : " + (12345.0 * 0.1));                             // 부가세
//        System.out.println("Total : " + (12345.0 + 12345.0 * 0.1));                 // 최종 가격
//        System.out.println("Expense : " + (12345.0 * 0.3));                         // 비용
//        System.out.println("Income : " + (12345.0 - 12345.0 * 0.3));                // 이익
//        System.out.println("Dividend 1: " + (12345.0 - 12345.0 * 0.3) * 0.5);        // 첫 번째 사람 배당금
//        System.out.println("Dividend 2: " + (12345.0 - 12345.0 * 0.3) * 0.3);        // 두 번째 사람 배당금
//        System.out.println("Dividend 3: " + (12345.0 - 12345.0 * 0.3) * 0.2);        // 세 번째 사람 배당금


        // 2. 변수 도입
//        double valueOfSupply = 10000.0;
//        double vatRate = 0.1;
//        double expenseRate = 0.3;
//
//        double vat = valueOfSupply * vatRate;
//        double total = valueOfSupply + vat;
//        double expense = valueOfSupply * expenseRate;
//        double income = valueOfSupply - expense;
//        double dividend1 = income * 0.5;
//        double dividend2 = income * 0.3;
//        double dividend3 = income * 0.2;
//
//        System.out.println("Value of supply : " + valueOfSupply);   // 공급가
//        System.out.println("VAT : " + vat);                         // 부가세
//        System.out.println("Total : " + total);                     // 최종 가격
//        System.out.println("Expense : " + expense);                 // 비용
//        System.out.println("Income : " + income);                   // 이익
//        System.out.println("Dividend 1: " + dividend1);             // 첫 번째 사람 배당금
//        System.out.println("Dividend 2: " + dividend2);             // 두 번째 사람 배당금
//        System.out.println("Dividend 3: " + dividend3);             // 세 번째 사람 배당금

        // 3. 입력값 도입
        // Double.parseDouble() : String to Double
        // args에서 받는 값은 기본적으로 String

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;

        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;
        double dividend1 = income * 0.5;
        double dividend2 = income * 0.3;
        double dividend3 = income * 0.2;

        System.out.println("Value of supply : " + valueOfSupply);   // 공급가
        System.out.println("VAT : " + vat);                         // 부가세
        System.out.println("Total : " + total);                     // 최종 가격
        System.out.println("Expense : " + expense);                 // 비용
        System.out.println("Income : " + income);                   // 이익
        System.out.println("Dividend 1: " + dividend1);             // 첫 번째 사람 배당금
        System.out.println("Dividend 2: " + dividend2);             // 두 번째 사람 배당금
        System.out.println("Dividend 3: " + dividend3);             // 세 번째 사람 배당금
    }
}
