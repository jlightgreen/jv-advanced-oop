package core.basesyntax;

public class Circle extends Figure {
    private int radius;

    public Circle(int radius, Color color) {
        super(color);
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure - circle, area - " + getArea()
                + ", perimeter length - " + getPerimeter()
                + ", color - " + getColor());
    }

    @Override
    public int getArea() {
        return (int) Math.pow(radius * Math.PI, 2);
    }

    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }

}
