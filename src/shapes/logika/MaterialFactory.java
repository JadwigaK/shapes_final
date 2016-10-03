package shapes.logika;

/**
 * Created by Jadwiga on 2016-10-02.
 */
public class MaterialFactory {
    public Material getMaterial(String[] s){
        Material material = new Material();

        for (int i = 0; i < s.length; i++){
            switch(s[i]) {
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

        for (int i=0; i < s.length; i++){
            switch(s[i]){
                case "very": material.setAdjective("very"); break;
                case "extremely": material.setAdjective("extremely"); break;
                case "quite": material.setAdjective("quite"); break;
            }
        }

        return material;
    }
}
