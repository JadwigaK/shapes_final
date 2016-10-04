package shapes.logika;

import java.util.List;

/**
 * Created by Jadwiga on 2016-10-02.
 */
public class MaterialFactory {
    public Material getMaterial(List<String> strings){
        Material material = new Material();

        for (String s: strings){
            switch(s) {
                case "plastic":
                    material =  new Material("plastic");
                break;
                case "metal":
                    material = new Material("metal");
                break;
                case "wooden":
                    material = new Material("wooden");
                break;
            }
        }

        for (String s: strings){
            switch(s){
                case "very": material.setAdjective("very"); break;
                case "extremely": material.setAdjective("extremely"); break;
                case "quite": material.setAdjective("quite"); break;
            }
        }

        return material;
    }
}
