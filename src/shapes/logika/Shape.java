package shapes.logika;


import shapes.Drawable;

/**
 * Created by Jadwiga on 2016-09-19.
 */
public abstract class Shape implements Drawable {

    protected int aX;
    protected int aY;

    private Material material;
    private Weight weight;



    public Shape(int mX, int mY){
        this.aX =mX;
        this.aY =mY;
    }

    public void setMaterial(Material m){
        this.material=m;
    }

    public void setWeight(Weight w){
        this.weight=w;
    }

    public String draw(){
        return weight + " and " + material;
    }


    public abstract double area();

}
