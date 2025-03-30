class Square implements Shape {
  double side;

  Square(double side) {
    this.side = side;
  }

  @Override
  public void accept(ShapeVisitor visitor) {
    visitor.visit(this);
  }
}