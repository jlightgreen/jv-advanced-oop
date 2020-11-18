package core.basesyntax;

public abstract class Figure {
    private Color color;

    public Figure(Color color) {
        this.color = color;
    }

    public abstract void draw();

    public abstract int getArea();

    public Color getColor() {
        return color;
    }
}
