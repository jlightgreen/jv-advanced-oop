package core.basesyntax;

public class Triangle extends Figure {
    private int firstSide;
    private int secondSide;
    private int thirdSide;

    public Triangle(int firstSide, int secondSide, int thirdSide, Color color) {
        super(color);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    @Override
    public void draw() {
        System.out.println("Figure - triangle, area - " + getArea()
                + ", perimeter length - " + getPerimeter()
                + ", color - " + getColor());
    }

    @Override
    public int getArea() {
        double halfPerimeter = (double) getPerimeter() / 2;
        return (int) Math.sqrt(halfPerimeter * (halfPerimeter - firstSide)
                * halfPerimeter - secondSide * halfPerimeter - thirdSide);
    }

    public int getPerimeter() {
        return firstSide + secondSide + thirdSide;
    }
}
