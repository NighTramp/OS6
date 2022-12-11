package os6.models;

public class Square extends Rectangle{
    public Square(SquareBuilder squareBuilder) {
        super(squareBuilder.sides);
    }
    @Override
    public Double area() {
        return Math.pow(sides[0], 2);
    }
    @Override
    public Double perimeter() {
        return super.perimeter() * 2;
    }

    public static class SquareBuilder{
        private Double[] sides;
        public SquareBuilder(Double... sides) {
            this.sides = sides;
        }
        public SquareBuilder check() {
            if (sides.length != 1)
                throw new RuntimeException();
            for (Double item:sides) {
                if (item <= 0)
                    throw new RuntimeException();
            }
            return this;
        }
        public Square build() {
            return new Square(this);
        }
    }
}
