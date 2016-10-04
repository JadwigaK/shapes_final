package shapes;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Jadwiga on 2016-09-22.
 */
public class StringParser {

    public static String readShapeParameters(String s){
        return s.split(",")[1];
    }

    public static List<String > readAdditionalParameters(String in){
        String[] st = in.split(",")[2].split(" ");
        List<String>  out = new LinkedList<String>();
        for (String s: st){
            out.add(s);
        }
        return out;
    }


    public static List<String> getCharacteristics(String in) {
        String[] st = in.split(",")[0].split(" ");
        List<String>  out = new LinkedList<String>();
        for (String s: st){
            out.add(s);
        }
        return out;
    }
}
