package shapes;

/**
 * Created by Jadwiga on 2016-09-23.
 */
public class ColorChange extends Animation {

    public ColorChange(Drawable drawable, String color){
       super(drawable, color);
    }

    public String draw(){
        return drawable.draw()+"which becomes "+ animation;
    }
}
