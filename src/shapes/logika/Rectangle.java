package shapes.logika;

/**
 * Created by Jadwiga on 2016-09-19.
 */
public class Rectangle extends Shape {
    private double a;
    private double b;

    public Rectangle(int mX, int mY, double a, double b){
        super(mX, mY);
        this.a=a;
        this.b=b;
    }

    @Override
    public double area() {
        return Math.round(a*b*100.0)/100.0;
    }

    @Override
    public String draw() {
        return super.draw()+" rectangle with central point in ("+ aX +","+ aY +") "+"and a "+a+" and b "+b+" and surface area "+this.area()+ " ";
    }
}
