import figures.Circle;
import figures.Rectangle;
import figures.Shape;

public class Main {
    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Circle("red"),
                new Rectangle("blue"),
                new Circle("green"),
                new Rectangle("white"),
                new Circle("brown"),
                new Rectangle("black"),
        };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}