package entities;

public class Rectangle {
    public double width;
    public double height;

    public double rectangleArea(){
        double a = this.width * this.height;
        return a;
    }

    public double rectanglePerimeter(){
        double p = 2 * (this.height + this.width);
        return p;
    }
    public double rectangleDiagonal(){
        double d = Math.sqrt((Math.pow(this.height, 2)) + (Math.pow(this.width, 2)));
        return d;
    }


}
