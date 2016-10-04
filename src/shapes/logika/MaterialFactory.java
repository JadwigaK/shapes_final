package shapes.logika;

import java.util.List;

/**
 * Created by Jadwiga on 2016-10-02.
 */
public class MaterialFactory {
    public Material getMaterial(String characteristic, String adjective){
        Material material = new Material();

            switch(characteristic) {
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

            switch(adjective){
                case "very": material.setAdjective("very"); break;
                case "extremely": material.setAdjective("extremely"); break;
                case "quite": material.setAdjective("quite"); break;
            }


        return material;
    }
}
