package shapes;

import shapes.logika.MaterialFactory;
import shapes.logika.WeightFactory;

import java.util.List;

/**
 * Created by Jadwiga on 2016-10-03.
 */
public class PrefixesProvider {

    public void giveMaterial(ShapeBuilder shapeBuilder, List<String> materials) {
        MaterialFactory materialFactory = new MaterialFactory();
        shapeBuilder.setMaterial(materialFactory.getMaterial(materials));
    }


    public void giveWeight(ShapeBuilder shapeBuilder, List<String> weights) {
        WeightFactory weightFactory = new WeightFactory();
        shapeBuilder.setWeight(weightFactory.getWeight(weights));
    }
}
