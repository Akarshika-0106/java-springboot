package machine.coding.practice.java.OOPS.SOLIDPrinciples.SingleResponsibilityPrinciple;

public class InvoicePrice {

    private Marker marker;
    private int quantity;

    public InvoicePrice(Marker marker, int quantity){
        this.marker = marker;
        this.quantity = quantity;
    }

    public int calculatePrice(){
        return this.quantity * marker.getPrice();
    }
}
