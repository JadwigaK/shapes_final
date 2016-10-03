package shapes;

/**
 * Created by Jadwiga on 2016-09-22.
 */
public class StringParser {

    public static String readShapeParameters(String s){
        return s.split(",")[1];
    }

    public static String[] readAdditionalParameters(String s){
        return s.split(",")[2].split(" ");
    }

    public static String[] readMaterialAndWeight(String s){
        return s.split(",")[0].split(" ");
    }


}
