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

    public static String[] readAdditionalParameters(String s){
        return s.split(",")[2].split(" ");
    }

    public static List<String> readMaterial(String s){
        String[] in = s.split(",")[0].split(" ");
        List<String> out = new LinkedList<String>();
        List<String> outMaterials = new LinkedList<String>();


        for (String str: in) {
            if (str.equals("very")  || str.equals("quite") || str.equals("extremely")) {
                out.add(str);
            } else if (str.equals("light") || str.equals("heavy")) {
                out.clear();
            } else if (str.equals("wooden") || str.equals("plastic") || str.equals("metal")) {
                outMaterials.add(str);
            }
        }

        System.out.println(out + " "+outMaterials);
        out.addAll(outMaterials);

        return  out;
    }

    public static List <String> readWeight(String s){
        String[] in = s.split(",")[0].split(" ");
        List<String> out = new LinkedList<String>();
        List<String> outWeights = new LinkedList<String>();

// wiem ze tu jeszcze nie dziala dobrze
        for (String str: in) {
            if (str.equals("very") || str.equals("quite") || str.equals("extremely")) {
                out.add(str);
            } else if (str.equals("wooden") || str.equals("plastic") || str.equals("metal")) {
                out.clear();
            } else if (str.equals("light") || str.equals("heavy")) {
                outWeights.add(str);
            }
        }
        out.addAll(outWeights);

        return  out;
    }


}
