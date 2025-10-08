package entities.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);

    double interest(double amount, int months);

    double renderFee(double amount, int months);


}
