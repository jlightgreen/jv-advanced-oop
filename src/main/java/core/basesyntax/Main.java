package core.basesyntax;

public class Main {
    private static int NUMBER_OF_SHAPES = 4;
    private static int MAX_LENGTH = 100;
    private static int NUMBER_OF_FIGURES = 20;

    public static void main(String[] args) {
        Figure[] figures = new Figure[NUMBER_OF_FIGURES];
        for (int i = 0; i < figures.length; i++) {
            int randomShape = randomNumber(NUMBER_OF_SHAPES);
            switch (randomShape) {
                case 1:
                    figures[i] = new Triangle(randomNumber(MAX_LENGTH),
                            randomNumber(MAX_LENGTH),
                            randomNumber(MAX_LENGTH),
                            getRandomColor());
                    break;
                case 2:
                    figures[i] = new Circle(randomNumber(MAX_LENGTH),
                            getRandomColor());
                    break;
                case 3:
                    figures[i] = new Trapezoid(randomNumber(MAX_LENGTH),
                            randomNumber(MAX_LENGTH),
                            getRandomColor());
                    break;
                default:
                    figures[i] = new Square(randomNumber(MAX_LENGTH),
                            getRandomColor());
                    break;
            }
        }

        for (Figure figure : figures) {
            figure.draw();
        }
    }

    public static Color getRandomColor() {
        int randomNumber = randomNumber(3);
        if (randomNumber == 1) {
            return Color.RED;
        }
        if (randomNumber == 2) {
            return Color.GREEN;
        } else {
            return Color.YELLOW;
        }
    }

    public static int randomNumber(int max) {
        return (int) (Math.random() * max + 1);
    }

}
