package shapes;

import shapes.logika.Material;
import shapes.logika.Shape;
import shapes.logika.Weight;

/**
 * Created by Jadwiga on 2016-09-23.
 */
public class ShapeBuilder {
    private ShapeFactory shapeFactory = new ShapeFactory();
    private Shape shape;

    public Shape getShape(String s){
        this.shape = shapeFactory.getShape(s);
        return this.shape;

    }


    public ShapeBuilder setMaterial(Material m){
        shape.setMaterial(m);
        return this;
    }

    public ShapeBuilder setWeight(Weight w){
        shape.setWeight(w);
        return this;
    }


    public Shape bulid(){
        return shape;
    }



}
