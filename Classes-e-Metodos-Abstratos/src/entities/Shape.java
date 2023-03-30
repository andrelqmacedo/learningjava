package entities;

import entities.enums.Color;

/*
A classe Shape é abstrata, pois seu metodo area() é abstrato
 */

public abstract class Shape {
    private Color color;

    public Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    public abstract double area();
}
