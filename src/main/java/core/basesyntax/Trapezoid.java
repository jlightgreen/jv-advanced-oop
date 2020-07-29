package core.basesyntax;

public class Trapezoid extends Figure {
    private double middleLine = getArea() - Math.random() * 10;

    public Trapezoid(int area, Color color) {
        super(area, color);
    }

    public void draw() {
        System.out.println("Figure - trapezoid, area - " + getArea()
                + ", height length - " + getHeight()
                + ", color - " + getColor());
    }

    public int getHeight() {
        return (int) Math.round(getArea() / middleLine);
    }
}
