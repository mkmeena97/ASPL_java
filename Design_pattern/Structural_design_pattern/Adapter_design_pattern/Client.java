package Structural_design_pattern.Adapter_design_pattern;

public class Client {
    public static void main(String[] args) {
        PaymentProcessor processor = new BankAdapter(new OldBankAPI());
        processor.pay("2500");
    }
}
