public class Square implements Shape {
  double side;

  Square(double side) {
    this.side = side;
  }

  public void draw() {
    System.out.println("Drawing a square with side: " + side);
  }

  public double calculateArea() {
    return side * side;
  }

  public void exportToXml() {
    System.out.println("Exporting a square with side: " + side);
  }
}