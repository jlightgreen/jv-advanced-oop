package core.basesyntax;

public class Triangle extends Figure {
    private double base;

    public Triangle(int area, Color color) {
        super(area, color);
    }

    public void draw() {
        System.out.println("Figure - triangle, area - " + getArea()
                + ", height length - " + getHeight()
                + ", color - " + getColor());
    }

    public int getHeight() {
        return (int) Math.round(getArea() / ((Math.random() * (getArea() + 1)) + 1));
    }
}
