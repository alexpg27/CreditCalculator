public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000;
        double yearInterestRate = 9.99;
        double monthInterestRate = yearInterestRate / 100 / 12;
        double oneYearCredit = (int) service.calculate(creditAmount, monthInterestRate, 12);
        double twoYearCredit = (int) service.calculate(creditAmount, monthInterestRate, 24);
        double threeYearCredit = (int) service.calculate(creditAmount, monthInterestRate, 36);

        System.out.println("Ежемесячный платёж: " + oneYearCredit + " рублей");
        System.out.println("Ежемесячный платёж: " + twoYearCredit + " рублей");
        System.out.println("Ежемесячный платёж: " + threeYearCredit + " рублей");
    }
}
