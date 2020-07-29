package core.basesyntax;

public abstract class Figure {
    private int area;
    private Color color;

    public Figure(int area, Color color) {
        this.area = area;
        this.color = color;
    }

    public abstract void draw();

    public int getArea() {
        return area;
    }

    public Color getColor() {
        return color;
    }
}
