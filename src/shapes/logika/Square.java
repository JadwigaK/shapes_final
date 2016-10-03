package shapes.logika;

import shapes.Drawable;

/**
 * Created by Jadwiga on 2016-09-19.
 */
public class Square extends Shape {
    private double a;

    public Square(int mX, int mY, double a) {
        super(mX, mY);
        this.a = a;
    }

    @Override
    public double area() {
        return Math.round(a * a * 100.0) / 100.0;
    }

    @Override
    public String draw() {
        return super.draw()+" square with central point in (" + aX + "," + aY + ") " + "and a " + a + " and surface area " + this.area() + " ";
    }
}

