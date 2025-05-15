package Structural_design_pattern.Adapter_design_pattern;

public class OldBankAPI {
    public void makePayment(String amt) {
        System.out.println("Payment of ₹" + amt + " done via Old Bank API.");
    }
}
