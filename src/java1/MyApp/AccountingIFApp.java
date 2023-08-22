package java1.MyApp;

public class AccountingIFApp {
    public static void main(String[] args) {

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;

        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        double dividend1;
        double dividend2;
        double dividend3;

        // income(이익)이 10000보다 큰 경우는 배당금을 나누고
        if(income > 10000.0){
            dividend1 = income * 0.5;
            dividend2 = income * 0.3;
            dividend3 = income * 0.2;

        // 10000보다 작다면 배당금을 첫 번째 사람이 다 가진다.
        } else{
            dividend1 = income * 1.0;
            dividend2 = income * 0;
            dividend3 = income * 0;
        }


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
