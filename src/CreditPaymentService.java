public class CreditPaymentService {
    public double calculate(int k, double p, int m) {
        return k * (p * Math.pow(1 + p, m)) / (Math.pow(1 + p, m) - 1);
    }
}


