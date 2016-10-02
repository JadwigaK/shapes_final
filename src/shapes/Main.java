package shapes;

import shapes.logika.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        String[] prefixes  = StringParser.readMaterialAndWeight(in);

        // czemu mi to podkresla na szaro ale dziala
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        Shape shape = shapeBuilder.getShape(parameters);

        // zakładamy ze na pocztaku jest zawsze Weight  z przymiotnikami a potem Material z przymiotnikami
        //i ja wiem ze ja tu itreuje po tym prefixes ze 4 razy przez te Faktorki co je dodałam ale jak mam nie filtrowac
        // to to jest taki najprostrzy sposób ktory mi wpadł do głowy
        WeightFactory weightFactory = new WeightFactory();
        Weight weight = weightFactory.getWeight(prefixes);

        MaterialFactory materialFactory = new MaterialFactory();
        Material material = materialFactory.getMaterial(prefixes);

        //ten cały bulider jest tu bez sensu bo tylko raz uzywam setMaterial setWEeight
        shape = shapeBuilder.setWeight(weight).setMaterial(material).bulid();



        Drawable drawable = shape;
        DrawableFactory drawableFactory= new DrawableFactory();
        if (shape != null){
            for (String animation: animations){
                drawable = drawableFactory.getDrawable(drawable, animation);
            }
            System.out.println("I'am "+drawable.draw());
        }

        System.out.println("Thank you! That is the end!");

    }
}
