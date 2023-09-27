public class Rectangle extends Shape {

    private double width, height;

    public Rectangle(double w, double h){
        super("Rectangle");
        this.width = w;
        this.height = h;
    }
    public double  getArea(){
        return this.height* this.width;
    }

public double getPerimeter(){
    return (this.height+this.width) * 2;
}
}
