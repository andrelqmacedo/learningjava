package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private LocalDate manufactureDate;

    public UsedProduct(String name, Double price, LocalDate manufacteDate) {
        super(name, price);
        this.manufactureDate = manufacteDate;
    }

    public LocalDate getManufacteDate() {
        return manufactureDate;
    }

    public void setManufacteDate(LocalDate manufacteDate) {
        this.manufactureDate = manufacteDate;
    }

    @Override
    public String priceTag(){
        return getName()
                + " (user) $ "
                + String.format("%.2f", getPrice())
                + " ( Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
    }
}
