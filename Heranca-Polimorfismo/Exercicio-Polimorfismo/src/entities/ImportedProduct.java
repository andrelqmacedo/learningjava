package entities;

import java.time.format.DateTimeFormatter;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    public void totalPrice(){
        price += customsFee;
    }
    @Override
    public String priceTag(){
        return getName()
                + " (imported) $ "
                + String.format("%.2f", getPrice())
                + " ( Customs fee: "
                + getCustomsFee()
                + ")";
    }
}
