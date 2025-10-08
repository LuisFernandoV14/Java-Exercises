package entities.services;

public class PaypalService implements OnlinePaymentService{

    @Override
    public double paymentFee(double amount) {
        return amount * 2 / 100;
    }

    @Override
    public double interest(double amount, int months) {
        return (amount * 1 / 100) * months;
    }

    @Override
    public double renderFee(double amount, int months) {
        amount += paymentFee(amount) + interest(amount, months);
        return amount;
    }

}
