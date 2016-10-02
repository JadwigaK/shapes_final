package shapes.logika;

/**
 * Created by Jadwiga on 2016-09-19.
 */
public class Circle extends Shape {
    private double r;

    public Circle (int mX, int mY, double r){
        super(mX, mY);
        this.r=r;
    }

    @Override
    public double area() {
        return Math.round(Math.PI*r*r*100.0)/100.0;
    }

    @Override
    public String draw() {
        return super.draw()+" circle with central point in ("+ aX +","+ aY +") "+" and radius "+r+" "+"and surface area "+this.area()+" ";
    }
}
