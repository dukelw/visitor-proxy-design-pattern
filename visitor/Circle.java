class Circle implements Shape {
  double radius;

  Circle(double radius) {
    this.radius = radius;
  }

  @Override
  public void accept(ShapeVisitor visitor) {
    visitor.visit(this);
  }
}