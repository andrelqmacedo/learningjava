package entities;

public class Employee {
    private Integer id;
    private String name;
    private Double wage;

    public Employee() {
    }

    public Employee(int id, String name, double wage) {
        this.id = id;
        this.name = name;
        this.wage = wage;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWage() {
        return wage;
    }
    public void increaseWage(double percentage){
        this.wage += this.wage * percentage / 100.0;
    }
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", wage);
    }
}
