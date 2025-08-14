package machine.coding.practice.LLD.Practice.DesignBookMyShow;

import machine.coding.practice.LLD.Practice.DesignBookMyShow.Enum.PaymentCategory;

public class Payment {
    private int paymentId;
    private PaymentCategory paymentCategory;

    public boolean isPaymentSuccess(PaymentCategory paymentCategory){
        makePayment(paymentCategory);
        return true;
    }

    public void makePayment(PaymentCategory paymentCategory){
        //logic
    }
}
