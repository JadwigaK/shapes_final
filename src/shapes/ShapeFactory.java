package shapes;

import shapes.logika.Circle;
import shapes.logika.Rectangle;
import shapes.logika.Shape;
import shapes.logika.Square;

/**
 * Created by Jadwiga on 2016-09-22.
 */
public class ShapeFactory {

    //dobrze
    // zalozenie zadania bylo takie, ze dane wejsciowe sa ok- gdyby mogly byc bledne, w default zamist zwracac null moglabys rzucic wyjatek jakis, np InvalidArgumentException,
    // lub wyjatek przechwytywany i przechwycic go a main, zeby bylo ladnie :)
    public Shape getShape(String s) {
        Shape shape;
        String[] input = s.split(" ");
        switch (input[0]) {
            case "circle":
                shape = new Circle(Integer.parseInt(input[1]), Integer.parseInt(input[2]), Double.parseDouble(input[3]));
                break;
            case "square":
                shape = new Square(Integer.parseInt(input[1]), Integer.parseInt(input[2]), Double.parseDouble(input[3]));
                break;
            case "rectangular":
                shape = new Rectangle(Integer.parseInt(input[1]), Integer.parseInt(input[2]), Double.parseDouble(input[3]), Double.parseDouble(input[4]));
                break;
            default:
                shape = null;
                break;
        }
        return shape;
    }
}
