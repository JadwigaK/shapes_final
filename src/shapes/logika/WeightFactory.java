package shapes.logika;

import java.util.List;

/**
 * Created by Jadwiga on 2016-10-02.
 */
public class WeightFactory {
    public Weight getWeight(String characteristic, String adjective ) {
        Weight weight = new Weight();

            switch (characteristic) {
                case "heavy":
                    weight = new Weight("heavy");
                    break;
                case "light":
                    weight = new Weight("light");
                    break;
            }

            switch (adjective) {
                case "very":
                    weight.setAdjective("very");
                    break;
                case "extremely":
                    weight.setAdjective("extremely");
                    break;
                case "quite":
                    weight.setAdjective("quite");
                    break;

        }

        return weight;
    }
}
