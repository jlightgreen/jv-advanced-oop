package core.basesyntax;

public class Trapezoid extends Figure {
    private int middleLine;
    private int height;

    public Trapezoid(int middleLine, int height, Color color) {
        super(color);
        this.middleLine = middleLine;
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Figure - trapezoid, area - " + getArea()
                + ", bases length - " + getSumOfBases()
                + ", color - " + getColor());
    }

    @Override
    public int getArea() {
        return middleLine * height;
    }

    public int getSumOfBases() {
        return getArea() / height * 2;
    }
}
