package core.basesyntax;

public class Circle extends Figure {

    public Circle(int area, Color color) {
        super(area, color);
    }

    public void draw() {
        System.out.println("Figure - circle, area - " + getArea()
                + ", radius length - " + getRadius()
                + ", color - " + getColor());
    }

    public int getRadius() {
        return (int) Math.pow(getArea() / Math.PI, 2);
    }

}
