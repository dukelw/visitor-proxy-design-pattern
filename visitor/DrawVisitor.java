public class DrawVisitor implements ShapeVisitor {
    @Override
    public void visit(Circle circle) {
        System.out.println("Drawing a circle with radius: " + circle.radius);
    }

    @Override
    public void visit(Square square) {
        System.out.println("Drawing a square with side: " + square.side);
    }
}
