package entities;

public class Product {
    //atributos
    private String name;
    private double price;
    private int quantity;

    //construtor
    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    //sobrecarga do construtor
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    //construtor padrão - nova sobrecarga
    public Product(){

    }


    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    //métodos
    public double totalValueInStock(){
        double totalValueInStock = this.price * this.quantity;
        return totalValueInStock;
    }

    public void addProducts(int quantity){
        this.quantity += quantity;
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public String toString() {
        return name
                + ", $ "
                + String.format("%.2f", price)
                +", "
                + quantity
                +" units, Total: $ "
                + String.format("%.2f", totalValueInStock());
    }
}
