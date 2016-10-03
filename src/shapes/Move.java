package shapes;

/**
 * Created by Jadwiga on 2016-09-23.
 */
public class Move extends Animation {

    public Move(Drawable drawable, String move){
        super(drawable, move);
    }

    public String draw(){
        return drawable.draw()+"which "+animation+"s ";
    }
}

