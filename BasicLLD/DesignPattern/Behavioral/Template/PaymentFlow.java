package BasicLLD.DesignPattern.Behavioral.Template;

public abstract class PaymentFlow {
    public abstract void validateRequest();
    public abstract void calculateFees();
    public abstract void debitAmount();
    public abstract void creditAmount();


//    ans these steps to be followed strictly
    public final void steps(){
        validateRequest();
        calculateFees();
        debitAmount();
        creditAmount();
    }
}
