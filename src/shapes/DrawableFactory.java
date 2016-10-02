package shapes;

/**
 * Created by Jadwiga on 2016-09-23.
 */
public class DrawableFactory {

    public Drawable getDrawable(Drawable drawable, String commend){
        switch(commend){
            case "rotate":
            case "dance":
            case "darken":
                return new Move(drawable, commend);
            case "red":
            case "blue":
            case "green":
                return new ColorChange(drawable,commend);
            default:
                return null;
        }
    }
}
