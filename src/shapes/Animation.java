package shapes;

/**
 * Created by Jadwiga on 2016-09-23.
 */
public abstract class Animation implements Drawable {
    protected Drawable drawable;
    protected String animation;

    public Animation(Drawable drawable, String animation){
        this.drawable=drawable;
        this.animation=animation;
    }

    public abstract String draw();
}
