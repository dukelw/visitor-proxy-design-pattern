public class TraditionalApproach {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape square = new Square(4);

        circle.draw();
        System.out.println("Area of circle: " + circle.calculateArea());

        square.draw();
        System.out.println("Area of square: " + square.calculateArea());

        circle.exportToXml();
        square.exportToXml();
    }
}