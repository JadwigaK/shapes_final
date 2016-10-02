package shapes.logika;

/**
 * Created by Jadwiga on 2016-09-23.
 */
public class Material {
    String name;
    String adjective;

    public Material() {
    }

    public Material(String name){
        this.name=name;
    }


    public void setAdjective(String adjective) {
        this.adjective=adjective;
    }

    @Override
    public String toString() {
        return adjective + " " + name;
    }
}
