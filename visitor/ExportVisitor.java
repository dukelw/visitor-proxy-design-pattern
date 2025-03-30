public class ExportVisitor implements ShapeVisitor {
  @Override
  public void visit(Circle circle) {
    System.out.println("Exporting a circle with radius: " + circle.radius);
  }

  @Override
  public void visit(Square square) {
    System.out.println("Exporting a square with side: " + square.side);
  }
}
