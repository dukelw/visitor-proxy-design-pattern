class AreaVisitor implements ShapeVisitor {
  @Override
  public void visit(Circle circle) {
    double area = Math.PI * circle.radius * circle.radius;
    System.out.println("Area of circle: " + area);
  }

  @Override
  public void visit(Square square) {
    double area = square.side * square.side;
    System.out.println("Area of square: " + area);
  }
}