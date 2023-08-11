package figures;

public class Rectangle extends Shape {
    private String coordinates;

    public Rectangle(String color) {
        this.setColor(color);
    }

    @Override
    public void draw() {
        System.out.println("Smbd is drawing a " + getColor() + " rectangle");
    }
}
