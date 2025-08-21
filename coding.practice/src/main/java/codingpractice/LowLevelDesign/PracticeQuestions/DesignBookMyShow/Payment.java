package codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow;

import codingpractice.LowLevelDesign.PracticeQuestions.DesignBookMyShow.Enum.PaymentCategory;

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
