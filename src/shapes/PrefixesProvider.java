package shapes;

import shapes.logika.MaterialFactory;
import shapes.logika.WeightFactory;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Jadwiga on 2016-10-03.
 */
public class PrefixesProvider {

public static boolean isMaterial(String characteristic) {
    switch (characteristic){
        case "wooden":case "plastic": case "metal": return true;
        default : return false;
    }

    }


    public static boolean isWeight(String characteristic) {
        switch (characteristic){
            case "light": case "heavy": return true;
            default : return false;
        }
    }

    public static boolean isAdjective(String characteristic) {
        switch (characteristic) {
            case "very":
            case "quite":
            case "extremely":
                return true;
            default:
                return false;
        }
    }

        public void setPrefixes(List<String>  characteristics, ShapeBuilder shapeBuilder) {
            MaterialFactory materialFactory = new MaterialFactory();
            WeightFactory weightFactory = new WeightFactory();

            String adjective = "";

            for(String characteristic: characteristics){
                if(isMaterial(characteristic)){
                    shapeBuilder.setMaterial(materialFactory.getMaterial(characteristic,adjective));
                    if ((characteristics.indexOf(characteristic)+1)!=characteristics.size() && isAdjective(characteristics.get(characteristics.indexOf(characteristic)+1))) {
                        adjective = "";
                    }
                }
                else if(isWeight(characteristic)){
                    shapeBuilder.setWeight(weightFactory.getWeight(characteristic,adjective));
                    if ((characteristics.indexOf(characteristic)+1)!=characteristics.size() && isAdjective(characteristics.get(characteristics.indexOf(characteristic)+1))) {
                        adjective = "";
                    }
                }
                else if(isAdjective(characteristic)){
                    adjective=characteristic;
                }
                else throw new IllegalArgumentException();
            }
    }


}