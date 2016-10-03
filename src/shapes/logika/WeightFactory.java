package shapes.logika;

/**
 * Created by Jadwiga on 2016-10-02.
 */
public class WeightFactory {
    public Weight getWeight(String[] s) {
        Weight weight = new Weight();
        int breakPonit = 0;

        for (int i = 0; i < s.length; i++) {
            switch (s[i]) {
                case "heavy":
                    weight = new Weight("heavy");
                    breakPonit=i;
                    break;
                case "light":
                    weight = new Weight("light");
                    breakPonit=i;
                    break;
            }
        }

        for (int i = 0; i < breakPonit; i++) {
            switch (s[i]) {
                case "very":
                    weight.setAdjective("very");
                    s[i]="0";
                    break;
                case "extremely":
                    weight.setAdjective("extremely");
                    s[i]="0";
                    break;
                case "quite":
                    weight.setAdjective("quite");
                    s[i]="0";
                    break;
            }
        }

        return weight;
    }
}
