package shapes;

import shapes.logika.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Jadwiga on 2016-09-23.
 */
public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println("Hello! What can I draw for you? Circle? Square? Rectangle?"+"\n");

        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String in = bufferRead.readLine();

        // Kolejne czesci oddzileone sa przecinkiem - bez spacji!!
        String parameters = StringParser.readShapeParameters(in);
        String[] animations = StringParser.readAdditionalParameters(in);
        List<String> materials  = StringParser.readMaterial(in);
        List<String> weights  = StringParser.readMaterial(in);
// czy o cos takiego Ci chodziło w main???
        ShapeBuilder shapeBuilder = new ShapeBuilder(parameters);

        shapeBuilder.getShape(parameters);

        PrefixesProvider pp = new PrefixesProvider();
        pp.giveMaterial(shapeBuilder, materials);
        pp.giveWeight(shapeBuilder, weights);

        Shape shape = shapeBuilder.bulid();

        Drawable drawable = shape;
        DrawableFactory drawableFactory= new DrawableFactory();
        if (shape != null){
            for (String animation: animations){
                drawable = drawableFactory.getDrawable(drawable, animation);
            }
            System.out.println("I am "+drawable.draw());
        }

        System.out.println("Thank you! That is the end!");

    }
}
