package os6.models;

import os6.data.Poligon;

public class Triangle extends Poligon {
    public Triangle(TriangleBuilder triangleBuilder) {
        super(triangleBuilder.sides);
    }
    @Override
    public Double area() {
        Double p = perimeter() / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
    @Override
    public Double perimeter() {
        return super.perimeter();
    }

    public static class TriangleBuilder{
        private Double[] sides;
        public TriangleBuilder(Double... sides) {
            this.sides = sides;
        }
        public TriangleBuilder check() {
            if (sides.length != 3)
                throw new RuntimeException();
            for (Double item:sides) {
                if (item <= 0)
                    throw new RuntimeException();
            }
            return this;
        }
        public Triangle build() {
            return new Triangle(this);
        }
    }
}
