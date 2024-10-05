package BasicLLD.DesignPattern.Behavioral.Template;

public class PaymentToFriend extends PaymentFlow{

    @Override
    public void validateRequest() {
        System.out.println("validating..");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fess");
    }

    @Override
    public void debitAmount() {
        System.out.println("amount debited");
    }

    @Override
    public void creditAmount() {
        System.out.println("amount credited");
    }
}
