package bridgePattern;

public class bridgeMain {

    public static void main(String[] args) throws CloneNotSupportedException {

        DrawAPI redCircle = new RedCircle();

        Circle circle = new Circle(10, 10, 10, redCircle);
        circle.draw();

        Circle circle1 = (Circle) circle.clone();
        circle1.setDrawAPI(new GreenCircle());
        circle1.draw();

    }
}
