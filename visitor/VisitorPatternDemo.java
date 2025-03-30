public class VisitorPatternDemo {
  public static void main(String[] args) {
    Shape circle = new Circle(5);
    Shape square = new Square(4);

    ShapeVisitor drawVisitor = new DrawVisitor();
    ShapeVisitor areaVisitor = new AreaVisitor();
    ShapeVisitor exportVisitor = new ExportVisitor();

    circle.accept(drawVisitor);
    square.accept(drawVisitor);

    circle.accept(areaVisitor);
    square.accept(areaVisitor);

    circle.accept(exportVisitor);
    square.accept(exportVisitor);
  }
}