package core.basesyntax;

public class Square extends Figure {
    public Square(int area, Color color) {
        super(area, color);
    }

    public void draw() {
        System.out.println("Figure - square, area - " + getArea()
                + ", side length - " + getSide()
                + ", color - " + getColor());
    }

    public int getSide() {
        return (int) Math.round(Math.sqrt(getArea()));
    }
}
