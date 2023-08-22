package java1.MyApp;

public class AccountingArrayLoopApp {
    public static void main(String[] args) {

        double valueOfSupply = Double.parseDouble(args[0]);
        double vatRate = 0.1;
        double expenseRate = 0.3;

        double vat = valueOfSupply * vatRate;
        double total = valueOfSupply + vat;
        double expense = valueOfSupply * expenseRate;
        double income = valueOfSupply - expense;

        System.out.println("Value of supply : " + valueOfSupply);   // 공급가
        System.out.println("VAT : " + vat);                         // 부가세
        System.out.println("Total : " + total);                     // 최종 가격
        System.out.println("Expense : " + expense);                 // 비용
        System.out.println("Income : " + income);                   // 이익

        // 반복문(loop) 부분
        // 반복문을 통해서 사람별로 배당금 출력해준다.
        // 3명일 땐 간편하지만 사람의 수가 엄청나게 많아질 경우 효율적이지 못함.

        // 길이가 3인 double형 리스트 생성
        double [] dividendRates = new double[3];

        // 해당 인덱스별로 값 정의
        dividendRates[0] = 0.5;
        dividendRates[1] = 0.3;
        dividendRates[2] = 0.2;

        int i = 0;
        // 배당받을 사람의 수만큼 반복
        while (i < dividendRates.length) {
            System.out.println("Dividend" + (i+1) + ": " + income * dividendRates[i]);             // i번째 사람 배당금
            i = i + 1;
        }
    }
}
