package core.basesyntax;

public class Square extends Figure {
    private int side;

    public Square(int side, Color color) {
        super(color);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Figure - square, area - " + getArea()
                + ", perimeter length - " + getPerimeter()
                + ", color - " + getColor());
    }

    @Override
    public int getArea() {
        return (int) Math.pow(side, 2);
    }

    public int getPerimeter() {
        return side * 4;
    }
}
