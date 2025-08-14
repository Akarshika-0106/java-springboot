package SolidPrinciples.SingleResponsibilityPrinciple;

public class InvoiceDao {

    private Invoice invoice;

    public InvoiceDao(Invoice invoice){
        this.invoice = invoice;
    }

    public void saveToDb(Invoice invoice){
        //logic
    }
}
