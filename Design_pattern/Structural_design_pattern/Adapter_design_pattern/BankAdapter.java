package Structural_design_pattern.Adapter_design_pattern;

public class BankAdapter implements PaymentProcessor {
    private OldBankAPI oldBankAPI;

    public BankAdapter(OldBankAPI oldBankAPI) {
        this.oldBankAPI = oldBankAPI;
    }

    @Override
    public void pay(String amount) {
        oldBankAPI.makePayment(amount); // adapting method call
    }
}
