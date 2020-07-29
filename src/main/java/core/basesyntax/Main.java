package core.basesyntax;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[(randomNumber(1, 100))];
        for (int i = 0; i < figures.length; i++) {
            int randomShape = randomNumber(1, 4);
            if (randomShape == 1) {
                figures[i] = new Triangle(randomNumber(10, 100), getRandomColor());
            }
            if (randomShape == 2) {
                figures[i] = new Circle(randomNumber(1, 100), getRandomColor());
            }
            if (randomShape == 3) {
                figures[i] = new Trapezoid(randomNumber(1, 100), getRandomColor());
            } else {
                figures[i] = new Square(randomNumber(1, 100), getRandomColor());
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }

    public static Color getRandomColor() {
        int randomNumber = randomNumber(1, 3);
        if (randomNumber == 1) {
            return Color.RED;
        }
        if (randomNumber == 2) {
            return Color.GREEN;
        } else {
            return Color.YELLOW;
        }
    }

    public static int randomNumber(int min, int max) {
        max -= min;
        return (int) (Math.random() * ++max) + min;
    }
}
