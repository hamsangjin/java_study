package java1.MyApp;

public class AccountingIFUnder10000App {
    public static void main(String[] args) {
        
        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;

        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        // 만약 imcome(이익)이 10000.0 이하인 경우 이 자바파일을 실행하게 할 수 있다.
        // 그러나 AccountingIFApp에 IF문으로 구현을 해놨다.
        double dividend1 = income * 1;
        double dividend2 = income * 0;
        double dividend3 = income * 0;

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
