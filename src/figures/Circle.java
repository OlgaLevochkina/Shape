package figures;

public class Circle extends Shape {

    private String coordinates;

    public Circle(String color) {
        this.setColor(color);
    }


    @Override
    public void draw() {
        System.out.println("Smbd is drawing a " + getColor() + " circle");
    }
}
