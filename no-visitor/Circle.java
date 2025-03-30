public class Circle implements Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  public void draw() {
    System.out.println("Drawing a circle with radius: " + radius);
  }

  public double calculateArea() {
    return Math.PI * radius * radius;
  }

  public void exportToXml() {
    System.out.println("Exporting a circle with radius: " + radius);
  }
}