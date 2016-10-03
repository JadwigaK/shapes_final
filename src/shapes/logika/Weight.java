package shapes.logika;

/**
 * Created by Jadwiga on 2016-09-23.
 */
public class Weight {
    String name;
    String adjective;

    public Weight() {
    }

    public Weight(String name){
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
